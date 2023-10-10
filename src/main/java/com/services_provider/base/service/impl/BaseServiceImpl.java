package com.services_provider.base.service.impl;

import com.services_provider.base.model.BaseModel;
import com.services_provider.base.repository.BaseRepository;
import com.services_provider.base.service.BaseService;
import com.services_provider.exception.NotValidModelException;
import com.services_provider.validation.EntityValidator;
import jakarta.persistence.EntityNotFoundException;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public abstract class BaseServiceImpl<E extends BaseModel<ID>, ID extends Serializable, R extends BaseRepository<E, ID>>
        implements BaseService<E, ID> {

    protected final R repository;
    protected final Validator validator = EntityValidator.validator;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public E save(E e) {
        try {
            if (!isValid(e)) throw new NotValidModelException();
            repository.getEntityManager().getTransaction().begin();
            repository.save(e);
            repository.getEntityManager().getTransaction().commit();
        } catch (Exception ex) {
            if (repository.getEntityManager().getTransaction().isActive()) {
                repository.getEntityManager().getTransaction().rollback();
            }
            System.err.println("Error while saving model: " + ex.getMessage());
            return null;
        }
        return e;
    }


    @Override
    public E update(E e) {
        try {
            if (!isValid(e)) throw new NotValidModelException();
            repository.getEntityManager().getTransaction().begin();
            repository.update(e);
            repository.getEntityManager().getTransaction().commit();
        } catch (Exception ex) {
            if (repository.getEntityManager().getTransaction().isActive()) {
                repository.getEntityManager().getTransaction().rollback();
            }
            System.err.println("Error while updating model: " + ex.getMessage());
        }
        return e;
    }

    @Override
    public void delete(E e) {
        try {
            repository.getEntityManager().getTransaction().begin();
            repository.delete(e);
            repository.getEntityManager().getTransaction().commit();
        } catch (Exception ex) {
            if (repository.getEntityManager().getTransaction().isActive()) {
                repository.getEntityManager().getTransaction().rollback();
            }
            System.err.println("Error while deleting model: " + ex.getMessage());
        }
    }

    @Override
    public E findById(ID id) {
        E e;
        try {
            e = repository.findById(id);
            if (e == null) throw new EntityNotFoundException("model does not exist");
        } catch (Exception ex) {
            System.err.println("Error while finding model by ID: " + ex.getMessage());
            return null;
        }
        return e;
    }

    @Override
    public List<E> findAll() {
        try {
            return repository.findAll();
        } catch (Exception ex) {
            System.err.println("Error while fetching models: " + ex.getMessage());
            return null;
        }
    }

    @Override
    public boolean isContainById(ID id) {
        try {
            return repository.isContainById(id);
        } catch (Exception ex) {
            System.err.println("Error while checking if model exists: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean isValid(E e) throws NotValidModelException {
        Set<ConstraintViolation<E>> violations = validator.validate(e);
        if (!violations.isEmpty()) {
            for (ConstraintViolation<E> p : violations)
                throw new NotValidModelException(p.getMessage());
            return false;
        }
        return true;
    }
}


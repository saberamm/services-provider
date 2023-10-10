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
            if (!isValid(e))
                return null;
        } catch (NotValidModelException n) {
            System.out.println("Error while saving model: " + n.getMessage());
            return null;
        }
        try {
            repository.getEntityManager().getTransaction().begin();
            repository.save(e);
            repository.getEntityManager().getTransaction().commit();
        } catch (Exception ex) {
            if (repository.getEntityManager().getTransaction().isActive()) {
                repository.getEntityManager().getTransaction().rollback();
            }
            throw new RuntimeException("Error while saving model: " + ex.getMessage(), ex);
        }
        return e;
    }


    @Override
    public E update(E e) {
        try {
            if (!isValid(e))
                return null;
        } catch (NotValidModelException n) {
            System.out.println("Error while updating model: " + n.getMessage());
            return null;
        }
        try {
            repository.getEntityManager().getTransaction().begin();
            repository.update(e);
            repository.getEntityManager().getTransaction().commit();
        } catch (EntityNotFoundException ex) {
            if (repository.getEntityManager().getTransaction().isActive()) {
                repository.getEntityManager().getTransaction().rollback();
            }
            throw new RuntimeException("Error while updating model: " + ex.getMessage(), ex);
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
            throw new RuntimeException("Error while deleting model: " + ex.getMessage(), ex);
        }
    }

    @Override
    public E findById(ID id) {
        E e;
        try {
            e = repository.findById(id);
        } catch (Exception ex) {
            throw new RuntimeException("Error while finding model by ID: " + ex.getMessage(), ex);
        }
        if (e == null) {
            throw new EntityNotFoundException("model is not exist");
        } else return e;
    }

    @Override
    public List<E> findAll() {
        try {
            return repository.findAll();
        } catch (Exception ex) {
            throw new RuntimeException("Error while fetching models: " + ex.getMessage(), ex);
        }
    }

    @Override
    public boolean isContainById(ID id) {
        try {
            return repository.isContainById(id);
        } catch (Exception ex) {
            throw new RuntimeException("Error while checking if model exists: " + ex.getMessage(), ex);
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


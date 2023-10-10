package com.services_provider.base.repository.impl;

import com.services_provider.base.model.BaseModel;
import com.services_provider.base.repository.BaseRepository;
import jakarta.persistence.EntityManager;

import java.io.Serializable;
import java.util.List;

public abstract class BaseRepositoryImpl<E extends BaseModel<ID>, ID extends Serializable> implements BaseRepository<E, ID> {

    protected final EntityManager entityManager;

    public BaseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public abstract Class<E> getEntityClass();

    @Override
    public E save(E e) {
        entityManager.persist(e);
        return e;
    }

    @Override
    public E update(E e) {
        return entityManager.merge(e);
    }

    @Override
    public void delete(E e) {
        entityManager.remove(e);
    }

    @Override
    public E findById(ID id) {
        return entityManager.find(getEntityClass(), id);
    }

    @Override
    public List<E> findAll() {
        return entityManager.createQuery("from " + getEntityClass().getSimpleName(), getEntityClass()).getResultList();
    }

    @Override
    public boolean isContainById(ID id) {
        E ic = entityManager.find(getEntityClass(), id);
        return ic != null;
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}

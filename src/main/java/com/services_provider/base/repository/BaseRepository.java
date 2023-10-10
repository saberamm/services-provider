package com.services_provider.base.repository;

import com.services_provider.base.model.BaseModel;
import jakarta.persistence.EntityManager;

import java.io.Serializable;
import java.util.List;

public interface BaseRepository<E extends BaseModel<ID>, ID extends Serializable> {
    E save(E e);

    E update(E e);

    void delete(E e);

    E findById(ID id);

    List<E> findAll();

    boolean isContainById(ID id);

    EntityManager getEntityManager();
}

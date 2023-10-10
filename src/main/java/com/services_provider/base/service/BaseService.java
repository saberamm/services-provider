package com.services_provider.base.service;

import com.services_provider.base.model.BaseModel;
import com.services_provider.exception.NotValidModelException;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends BaseModel<ID>, ID extends Serializable> {
    E save(E e);

    E update(E e);

    void delete(E e);

    E findById(ID id);

    List<E> findAll();

    boolean isContainById(ID id);

    boolean isValid(E e) throws NotValidModelException;
}
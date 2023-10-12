package com.services_provider.repository.impl;

import com.services_provider.base.repository.impl.BaseRepositoryImpl;
import com.services_provider.model.Admin;
import com.services_provider.repository.AdminRepository;
import jakarta.persistence.EntityManager;

public class AdminRepositoryImpl extends BaseRepositoryImpl<Admin, Long> implements AdminRepository {
    public AdminRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Admin> getEntityClass() {
        return Admin.class;
    }
}

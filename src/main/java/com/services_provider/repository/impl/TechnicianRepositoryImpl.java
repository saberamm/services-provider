package com.services_provider.repository.impl;

import com.services_provider.base.repository.impl.BaseRepositoryImpl;
import com.services_provider.model.Technician;
import com.services_provider.repository.TechnicianRepository;
import jakarta.persistence.EntityManager;

public class TechnicianRepositoryImpl extends BaseRepositoryImpl<Technician, Long> implements TechnicianRepository {
    public TechnicianRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Technician> getEntityClass() {
        return Technician.class;
    }
}

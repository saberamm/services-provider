package com.services_provider.repository.impl;

import com.services_provider.base.repository.impl.BaseRepositoryImpl;
import com.services_provider.model.GeneralService;
import com.services_provider.repository.GeneralServiceRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class GeneralServiceRepositoryImpl extends BaseRepositoryImpl<GeneralService, Long> implements GeneralServiceRepository {
    public GeneralServiceRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<GeneralService> getEntityClass() {
        return GeneralService.class;
    }
    @Override
    public GeneralService findGeneralServiceByName(String name) {
        TypedQuery<GeneralService> query = entityManager.createQuery(
                "SELECT s FROM GeneralService s WHERE s.serviceName = :name", getEntityClass());
        query.setParameter("serviceName", name);
        return query.getSingleResult();
    }
}

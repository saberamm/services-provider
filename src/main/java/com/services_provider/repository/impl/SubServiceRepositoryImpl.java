package com.services_provider.repository.impl;

import com.services_provider.base.repository.impl.BaseRepositoryImpl;
import com.services_provider.model.SubService;
import com.services_provider.repository.SubServiceRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class SubServiceRepositoryImpl extends BaseRepositoryImpl<SubService, Long> implements SubServiceRepository {
    public SubServiceRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<SubService> getEntityClass() {
        return SubService.class;
    }
    @Override
    public SubService findSubServiceByName(String name) {
        TypedQuery<SubService> query = entityManager.createQuery(
                "SELECT s FROM SubService s WHERE s.subServiceName = :name", getEntityClass());
        query.setParameter("name", name);
        return query.getResultStream().findFirst().orElse(null);
    }
}

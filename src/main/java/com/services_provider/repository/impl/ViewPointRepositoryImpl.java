package com.services_provider.repository.impl;

import com.services_provider.base.repository.impl.BaseRepositoryImpl;
import com.services_provider.model.ViewPoint;
import com.services_provider.repository.ViewPointRepository;
import jakarta.persistence.EntityManager;

public class ViewPointRepositoryImpl extends BaseRepositoryImpl<ViewPoint, Long> implements ViewPointRepository {
    public ViewPointRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<ViewPoint> getEntityClass() {
        return ViewPoint.class;
    }
}

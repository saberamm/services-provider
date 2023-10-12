package com.services_provider.repository.impl;

import com.services_provider.base.repository.impl.BaseRepositoryImpl;
import com.services_provider.model.Offer;
import com.services_provider.repository.OfferRepository;
import jakarta.persistence.EntityManager;

public class OfferRepositoryImpl extends BaseRepositoryImpl<Offer, Long> implements OfferRepository {
    public OfferRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Offer> getEntityClass() {
        return Offer.class;
    }
}

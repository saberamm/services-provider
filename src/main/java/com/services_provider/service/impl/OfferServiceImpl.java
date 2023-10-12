package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.model.Offer;
import com.services_provider.repository.OfferRepository;
import com.services_provider.service.OfferService;

public class OfferServiceImpl extends BaseServiceImpl<Offer, Long, OfferRepository> implements OfferService {
    public OfferServiceImpl(OfferRepository repository) {
        super(repository);
    }
}

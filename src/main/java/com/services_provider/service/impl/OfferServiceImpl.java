package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.dto.DtoMapper;
import com.services_provider.model.Offer;
import com.services_provider.repository.OfferRepository;
import com.services_provider.service.*;

public class OfferServiceImpl extends BaseServiceImpl<Offer, Long, OfferRepository> implements OfferService {
    public DtoMapper dtoMapper;

    public OfferServiceImpl(OfferRepository repository, DtoMapper dtoMapper) {
        super(repository);
        this.dtoMapper = dtoMapper;
    }
}

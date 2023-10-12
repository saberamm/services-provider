package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.model.GeneralService;
import com.services_provider.repository.GeneralServiceRepository;
import com.services_provider.service.GeneralService_Service;

public class GeneralService_ServiceImpl extends BaseServiceImpl<GeneralService, Long, GeneralServiceRepository> implements GeneralService_Service {
    public GeneralService_ServiceImpl(GeneralServiceRepository repository) {
        super(repository);
    }
}

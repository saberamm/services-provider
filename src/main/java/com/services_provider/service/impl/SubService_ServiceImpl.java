package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.model.SubService;
import com.services_provider.repository.SubServiceRepository;
import com.services_provider.service.SubService_Service;

public class SubService_ServiceImpl extends BaseServiceImpl<SubService, Long, SubServiceRepository> implements SubService_Service {
    public SubService_ServiceImpl(SubServiceRepository repository) {
        super(repository);
    }
}

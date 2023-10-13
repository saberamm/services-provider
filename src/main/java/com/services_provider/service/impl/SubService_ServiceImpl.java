package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.dto.DtoMapper;
import com.services_provider.model.SubService;
import com.services_provider.repository.SubServiceRepository;
import com.services_provider.service.*;

public class SubService_ServiceImpl extends BaseServiceImpl<SubService, Long, SubServiceRepository> implements SubService_Service {
    public DtoMapper dtoMapper;

    public SubService_ServiceImpl(SubServiceRepository repository, DtoMapper dtoMapper) {
        super(repository);
        this.dtoMapper = dtoMapper;
    }

    @Override
    public SubService findSubServiceByName(String name) {
        try {
            return repository.findSubServiceByName(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}

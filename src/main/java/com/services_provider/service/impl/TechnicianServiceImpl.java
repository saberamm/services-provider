package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.dto.DtoMapper;
import com.services_provider.model.Technician;
import com.services_provider.repository.TechnicianRepository;
import com.services_provider.service.*;
import com.services_provider.util.ApplicationContext;

public class TechnicianServiceImpl extends BaseServiceImpl<Technician, Long, TechnicianRepository> implements TechnicianService {
    public DtoMapper dtoMapper;

    public TechnicianServiceImpl(TechnicianRepository repository, DtoMapper dtoMapper) {
        super(repository);
        this.dtoMapper = dtoMapper;
    }

    @Override
    public void changePassword(String userName, String password, String newPassword) {
        ApplicationContext.getUserService().changePassword(userName,password,newPassword);
    }
}

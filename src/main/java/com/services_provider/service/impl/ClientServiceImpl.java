package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.dto.DtoMapper;
import com.services_provider.model.Client;
import com.services_provider.repository.ClientRepository;
import com.services_provider.service.*;
import com.services_provider.util.ApplicationContext;

public class ClientServiceImpl extends BaseServiceImpl<Client, Long, ClientRepository> implements ClientService {
    public DtoMapper dtoMapper;

    public ClientServiceImpl(ClientRepository repository, DtoMapper dtoMapper) {
        super(repository);
        this.dtoMapper = dtoMapper;
    }

    @Override
    public void changePassword(String userName, String password, String newPassword) {
        ApplicationContext.getUserService().changePassword(userName,password,newPassword);
    }
}

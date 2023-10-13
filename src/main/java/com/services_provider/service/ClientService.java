package com.services_provider.service;

import com.services_provider.base.service.BaseService;
import com.services_provider.model.Client;

public interface ClientService extends BaseService<Client, Long> {
    void changePassword(String userName, String password,String newPassword);
}

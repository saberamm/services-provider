package com.services_provider.service;

import com.services_provider.base.service.BaseService;
import com.services_provider.model.Client;
import com.services_provider.model.GeneralService;
import com.services_provider.model.Order;
import com.services_provider.model.SubService;

import java.util.List;

public interface ClientService extends BaseService<Client, Long> {
    void changePassword(String userName, String password,String newPassword);

    void addOrderByClient(Order order, Client client);

    List<GeneralService> seeGeneralServicesByClient();

    List<SubService> seeSubServicesByClient();
}

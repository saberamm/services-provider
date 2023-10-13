package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.dto.DtoMapper;
import com.services_provider.exception.PriceIsLowerThanBasePriceException;
import com.services_provider.model.Client;
import com.services_provider.model.GeneralService;
import com.services_provider.model.Order;
import com.services_provider.model.SubService;
import com.services_provider.repository.ClientRepository;
import com.services_provider.service.*;
import com.services_provider.util.ApplicationContext;

import java.util.List;

public class ClientServiceImpl extends BaseServiceImpl<Client, Long, ClientRepository> implements ClientService {
    public DtoMapper dtoMapper;

    public ClientServiceImpl(ClientRepository repository, DtoMapper dtoMapper) {
        super(repository);
        this.dtoMapper = dtoMapper;
    }

    @Override
    public void changePassword(String userName, String password, String newPassword) {
        ApplicationContext.getUserService().changePassword(userName, password, newPassword);
    }

    @Override
    public void addOrderByClient(Order order, Client client) {
        try {
            if (order.getOrderPrice() <= order.getSubService().getBasePrice()) {
                throw new PriceIsLowerThanBasePriceException("order price should be greater than base price");
            }
            order.setClient(client);
            ApplicationContext.getOrderService().save(order);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<GeneralService> seeGeneralServicesByClient() {
        try {
            return ApplicationContext.getGeneralService_Service().findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<SubService> seeSubServicesByClient() {
        try {
            return ApplicationContext.getSubService_Service().findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

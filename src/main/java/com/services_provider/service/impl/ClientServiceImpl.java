package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.dto.DtoMapper;
import com.services_provider.model.Client;
import com.services_provider.repository.ClientRepository;
import com.services_provider.service.*;

public class ClientServiceImpl extends BaseServiceImpl<Client, Long, ClientRepository> implements ClientService {
    public DtoMapper dtoMapper;
    public GeneralService_Service generalService_service;
    public OfferService offerService;
    public OrderService orderService;
    public SubService_Service subService_service;
    public TechnicianService technicianService;
    public UserService userService;
    public ViewPointService viewPointService;

    public ClientServiceImpl(ClientRepository repository, DtoMapper dtoMapper,
                             GeneralService_Service generalService_service, OfferService offerService,
                             OrderService orderService, SubService_Service subService_service,
                             TechnicianService technicianService, UserService userService,
                             ViewPointService viewPointService) {
        super(repository);
        this.dtoMapper = dtoMapper;
        this.generalService_service = generalService_service;
        this.offerService = offerService;
        this.orderService = orderService;
        this.subService_service = subService_service;
        this.technicianService = technicianService;
        this.userService = userService;
        this.viewPointService = viewPointService;
    }
}

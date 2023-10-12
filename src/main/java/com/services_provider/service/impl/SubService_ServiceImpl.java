package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.dto.DtoMapper;
import com.services_provider.model.SubService;
import com.services_provider.repository.SubServiceRepository;
import com.services_provider.service.*;

public class SubService_ServiceImpl extends BaseServiceImpl<SubService, Long, SubServiceRepository> implements SubService_Service {
    public DtoMapper dtoMapper;
    public ClientService clientService;
    public GeneralService_Service generalService_service;
    public OfferService offerService;
    public OrderService orderService;

    public SubService_ServiceImpl(SubServiceRepository repository, DtoMapper dtoMapper,
                                  ClientService clientService, GeneralService_Service generalService_service,
                                  OfferService offerService, OrderService orderService,
                                  TechnicianService technicianService, UserService userService,
                                  ViewPointService viewPointService) {
        super(repository);
        this.dtoMapper = dtoMapper;
        this.clientService = clientService;
        this.generalService_service = generalService_service;
        this.offerService = offerService;
        this.orderService = orderService;
        this.technicianService = technicianService;
        this.userService = userService;
        this.viewPointService = viewPointService;
    }

    public TechnicianService technicianService;
    public UserService userService;
    public ViewPointService viewPointService;
}

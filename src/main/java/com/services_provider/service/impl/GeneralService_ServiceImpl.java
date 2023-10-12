package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.dto.DtoMapper;
import com.services_provider.model.GeneralService;
import com.services_provider.repository.GeneralServiceRepository;
import com.services_provider.service.*;

public class GeneralService_ServiceImpl extends BaseServiceImpl<GeneralService, Long, GeneralServiceRepository> implements GeneralService_Service {
    public DtoMapper dtoMapper;
    public ClientService clientService;
    public OfferService offerService;
    public OrderService orderService;
    public SubService_Service subService_service;
    public TechnicianService technicianService;
    public UserService userService;
    public ViewPointService viewPointService;

    public GeneralService_ServiceImpl(GeneralServiceRepository repository, DtoMapper dtoMapper,
                                      ClientService clientService, OfferService offerService,
                                      OrderService orderService, SubService_Service subService_service,
                                      TechnicianService technicianService, UserService userService,
                                      ViewPointService viewPointService) {
        super(repository);
        this.dtoMapper = dtoMapper;
        this.clientService = clientService;
        this.offerService = offerService;
        this.orderService = orderService;
        this.subService_service = subService_service;
        this.technicianService = technicianService;
        this.userService = userService;
        this.viewPointService = viewPointService;
    }
}

package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.dto.DtoMapper;
import com.services_provider.model.Technician;
import com.services_provider.repository.TechnicianRepository;
import com.services_provider.service.*;

public class TechnicianServiceImpl extends BaseServiceImpl<Technician, Long, TechnicianRepository> implements TechnicianService {
    public DtoMapper dtoMapper;
    public ClientService clientService;
    public GeneralService_Service generalService_service;
    public OfferService offerService;
    public OrderService orderService;
    public SubService_Service subService_service;
    public UserService userService;
    public ViewPointService viewPointService;

    public TechnicianServiceImpl(TechnicianRepository repository, DtoMapper dtoMapper,
                                 ClientService clientService, GeneralService_Service generalService_service,
                                 OfferService offerService, OrderService orderService,
                                 SubService_Service subService_service, UserService userService,
                                 ViewPointService viewPointService) {
        super(repository);
        this.dtoMapper = dtoMapper;
        this.clientService = clientService;
        this.generalService_service = generalService_service;
        this.offerService = offerService;
        this.orderService = orderService;
        this.subService_service = subService_service;
        this.userService = userService;
        this.viewPointService = viewPointService;
    }
}

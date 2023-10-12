package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.dto.DtoMapper;
import com.services_provider.model.Offer;
import com.services_provider.repository.OfferRepository;
import com.services_provider.service.*;

public class OfferServiceImpl extends BaseServiceImpl<Offer, Long, OfferRepository> implements OfferService {
    public DtoMapper dtoMapper;
    public ClientService clientService;
    public GeneralService_Service generalService_service;
    public OrderService orderService;
    public SubService_Service subService_service;
    public TechnicianService technicianService;
    public UserService userService;
    public ViewPointService viewPointService;

    public OfferServiceImpl(OfferRepository repository, DtoMapper dtoMapper, ClientService clientService,
                            GeneralService_Service generalService_service, OrderService orderService,
                            SubService_Service subService_service, TechnicianService technicianService,
                            UserService userService, ViewPointService viewPointService) {
        super(repository);
        this.dtoMapper = dtoMapper;
        this.clientService = clientService;
        this.generalService_service = generalService_service;
        this.orderService = orderService;
        this.subService_service = subService_service;
        this.technicianService = technicianService;
        this.userService = userService;
        this.viewPointService = viewPointService;
    }
}

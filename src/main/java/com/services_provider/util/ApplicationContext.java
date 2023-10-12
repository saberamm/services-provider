package com.services_provider.util;

import com.services_provider.dto.DtoMapper;
import com.services_provider.dto.impl.DtoMapperImpl;
import com.services_provider.repository.*;
import com.services_provider.repository.impl.*;
import com.services_provider.service.*;
import com.services_provider.service.impl.*;
import jakarta.persistence.EntityManager;

public class ApplicationContext {
    static EntityManager entityManager = HibernateUtils.getEntityManagerFactory().createEntityManager();

    //------------ user application context ------------------//

    private static final UserService userService;

    static {
        DtoMapper dtoMapper = new DtoMapperImpl();
        UserRepository userRepository = new UserRepositoryImpl(entityManager);
        userService = new UserServiceImpl(userRepository, dtoMapper);
    }

    public static UserService getUserService() {
        return userService;
    }

    //------------ admin application context ------------------//

    private static final AdminService adminService;

    static {
        DtoMapper dtoMapper = new DtoMapperImpl();
        AdminRepository adminRepository = new AdminRepositoryImpl(entityManager);
        adminService = new AdminServiceImpl(adminRepository, dtoMapper);
    }

    public static AdminService getAdminService() {
        return adminService;
    }

    //------------ client application context ------------------//

    private static final ClientService clientService;

    static {
        DtoMapper dtoMapper = new DtoMapperImpl();
        ClientRepository clientRepository = new ClientRepositoryImpl(entityManager);
        clientService = new ClientServiceImpl(clientRepository, dtoMapper);
    }

    public static ClientService getClientService() {
        return clientService;
    }

    //------------ general service application context ------------------//

    private static final GeneralService_Service generalService_Service;

    static {
        DtoMapper dtoMapper = new DtoMapperImpl();
        GeneralServiceRepository generalServiceRepository = new GeneralServiceRepositoryImpl(entityManager);
        generalService_Service = new GeneralService_ServiceImpl(generalServiceRepository, dtoMapper);
    }

    public static GeneralService_Service getGeneralService_Service() {
        return generalService_Service;
    }

    //------------ offer application context ------------------//

    private static final OfferService offerService;

    static {
        DtoMapper dtoMapper = new DtoMapperImpl();
        OfferRepository offerRepository = new OfferRepositoryImpl(entityManager);
        offerService = new OfferServiceImpl(offerRepository, dtoMapper);
    }

    public static OfferService getOfferService() {
        return offerService;
    }

    //------------ order application context ------------------//

    private static final OrderService orderService;

    static {
        DtoMapper dtoMapper = new DtoMapperImpl();
        OrderRepository orderRepository = new OrderRepositoryImpl(entityManager);
        orderService = new OrderServiceImpl(orderRepository, dtoMapper);
    }

    public static OrderService getOrderService() {
        return orderService;
    }

    //------------ sub service application context ------------------//

    private static final SubService_Service subService_Service;

    static {
        DtoMapper dtoMapper = new DtoMapperImpl();
        SubServiceRepository subServiceRepository = new SubServiceRepositoryImpl(entityManager);
        subService_Service = new SubService_ServiceImpl(subServiceRepository, dtoMapper);
    }

    public static SubService_Service getSubService_Service() {
        return subService_Service;
    }

    //------------ technician application context ------------------//

    private static final TechnicianService technicianService;

    static {
        DtoMapper dtoMapper = new DtoMapperImpl();
        TechnicianRepository technicianRepository = new TechnicianRepositoryImpl(entityManager);
        technicianService = new TechnicianServiceImpl(technicianRepository, dtoMapper);
    }

    public static TechnicianService getTechnicianService() {
        return technicianService;
    }

    //------------ view point application context ------------------//

    private static final ViewPointService viewPointService;

    static {
        DtoMapper dtoMapper = new DtoMapperImpl();
        ViewPointRepository viewPointRepository = new ViewPointRepositoryImpl(entityManager);
        viewPointService = new ViewPointServiceImpl(viewPointRepository, dtoMapper);
    }

    public static ViewPointService getViewPointService() {
        return viewPointService;
    }
}

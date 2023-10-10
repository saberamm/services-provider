package com.services_provider.util;

import com.services_provider.dto.DtoMapper;
import com.services_provider.dto.impl.DtoMapperImpl;
import com.services_provider.repository.UserRepository;
import com.services_provider.repository.impl.UserRepositoryImpl;
import com.services_provider.service.UserService;
import com.services_provider.service.impl.UserServiceImpl;
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
}

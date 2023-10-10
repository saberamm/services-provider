package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.dto.DtoMapper;
import com.services_provider.model.User;
import com.services_provider.model.dtomodel.SimpleUser;
import com.services_provider.repository.UserRepository;
import com.services_provider.service.UserService;

public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepository> implements UserService {

    public DtoMapper dtoMapper;

    public UserServiceImpl(UserRepository repository, DtoMapper dtoMapper) {
        super(repository);
        this.dtoMapper = dtoMapper;
    }

    @Override
    public User findUserByUsername(String username) {
        try {
            return repository.findUserByUsername(username);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public SimpleUser findDtoUserByUsername(String username) {
        try {
            return dtoMapper.userDtoMapper(findUserByUsername(username));
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public User userAuthentication(String user_name, String password) {
        try {
            return repository.userAuthentication(user_name, password);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }
}

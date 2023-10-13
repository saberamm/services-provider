package com.services_provider.service;

import com.services_provider.base.service.BaseService;
import com.services_provider.model.User;
import com.services_provider.model.dtomodel.SimpleUser;

public interface UserService extends BaseService<User, Long> {

    User findUserByUsername(String username);
    void changePassword(String userName, String password,String newPassword);

    SimpleUser findDtoUserByUsername(String username);

    User userAuthentication(String userName, String password);
}

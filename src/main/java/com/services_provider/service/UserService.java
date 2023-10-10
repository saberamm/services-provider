package com.services_provider.service;

import com.services_provider.base.service.BaseService;
import com.services_provider.model.User;
import com.services_provider.model.dtomodel.SimpleUser;

public interface UserService extends BaseService<User, Long> {

    SimpleUser findUserByUsername(String username);

    User userAuthentication(String user_name, String password);
}

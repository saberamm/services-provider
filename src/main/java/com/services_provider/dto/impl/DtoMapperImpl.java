package com.services_provider.dto.impl;

import com.services_provider.dto.DtoMapper;
import com.services_provider.model.User;
import com.services_provider.model.dtomodel.SimpleUser;

public class DtoMapperImpl implements DtoMapper {
    @Override
    public SimpleUser userDtoMapper(User user) {
        if (user == null) {
            return null;
        }
        SimpleUser simpleUser = new SimpleUser();
        simpleUser.setFirstname(user.getFirstName());
        simpleUser.setLastname(user.getLastName());
        simpleUser.setUsername(user.getUsername());
        simpleUser.setBirthDate(user.getBirthDate());

        return simpleUser;
    }
}

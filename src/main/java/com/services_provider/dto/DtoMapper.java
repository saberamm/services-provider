package com.services_provider.dto;

import com.services_provider.model.User;
import com.services_provider.model.dtomodel.SimpleUser;

public interface DtoMapper {
    SimpleUser userDtoMapper(User user);
}

package com.services_provider.repository;

import com.services_provider.base.repository.BaseRepository;
import com.services_provider.model.User;

public interface UserRepository extends BaseRepository<User, Long> {
    User findUserByUsername(String username);

    User userAuthentication(String username, String password);
}

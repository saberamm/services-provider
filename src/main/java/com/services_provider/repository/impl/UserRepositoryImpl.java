package com.services_provider.repository.impl;

import com.services_provider.base.repository.impl.BaseRepositoryImpl;
import com.services_provider.model.User;
import com.services_provider.repository.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class UserRepositoryImpl extends BaseRepositoryImpl<User, Long> implements UserRepository {

    public UserRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public User findUserByUsername(String username) {
        TypedQuery<User> query = entityManager.createQuery(
                "SELECT u FROM User u WHERE u.userName = :username", getEntityClass());
        query.setParameter("username", username);
        return query.getSingleResult();
    }

    @Override
    public User userAuthentication(String username, String password) {
        TypedQuery<User> query = entityManager.createQuery(
                "SELECT u FROM User u WHERE u.userName = :username AND u.password = :password", getEntityClass());
        query.setParameter("username", username);
        query.setParameter("password", password);
        return query.getSingleResult();
    }
}

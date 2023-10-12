package com.services_provider.repository.impl;

import com.services_provider.base.repository.impl.BaseRepositoryImpl;
import com.services_provider.model.Client;
import com.services_provider.repository.ClientRepository;
import jakarta.persistence.EntityManager;

public class ClientRepositoryImpl extends BaseRepositoryImpl<Client, Long> implements ClientRepository {
    public ClientRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Client> getEntityClass() {
        return Client.class;
    }
}

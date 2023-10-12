package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.model.Technician;
import com.services_provider.repository.TechnicianRepository;
import com.services_provider.service.TechnicianService;

public class TechnicianServiceImpl extends BaseServiceImpl<Technician, Long, TechnicianRepository> implements TechnicianService {
    public TechnicianServiceImpl(TechnicianRepository repository) {
        super(repository);
    }
}

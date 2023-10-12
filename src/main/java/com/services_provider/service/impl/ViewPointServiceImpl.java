package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.model.ViewPoint;
import com.services_provider.repository.ViewPointRepository;
import com.services_provider.service.ViewPointService;

public class ViewPointServiceImpl extends BaseServiceImpl<ViewPoint, Long, ViewPointRepository> implements ViewPointService {
    public ViewPointServiceImpl(ViewPointRepository repository) {
        super(repository);
    }
}

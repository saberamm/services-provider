package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.dto.DtoMapper;
import com.services_provider.model.*;
import com.services_provider.repository.AdminRepository;
import com.services_provider.service.*;
import com.services_provider.util.ApplicationContext;

public class AdminServiceImpl extends BaseServiceImpl<Admin, Long, AdminRepository> implements AdminService {
    public DtoMapper dtoMapper;

    public AdminServiceImpl(AdminRepository repository, DtoMapper dtoMapper) {
        super(repository);
        this.dtoMapper = dtoMapper;
    }

    @Override
    public GeneralService addGeneralServiceByAdmin(GeneralService generalService) {
        return ApplicationContext.getGeneralService_Service().save(generalService);
    }

    @Override
    public SubService addSubServiceByAdmin(SubService subService) {
        return ApplicationContext.getSubService_Service().save(subService);
    }

    @Override
    public Technician addTechnicianByAdmin(Technician technician) {
        return ApplicationContext.getTechnicianService().save(technician);
    }

    @Override
    public void deleteTechnicianByAdmin(String userName) {
        User technician = ApplicationContext.getUserService().findUserByUsername(userName);
        ApplicationContext.getUserService().delete(technician);
    }

    @Override
    public void changePassword(String userName, String password, String newPassword) {
        ApplicationContext.getUserService().changePassword(userName, password, newPassword);
    }
}

package com.services_provider.service.impl;

import com.services_provider.base.service.impl.BaseServiceImpl;
import com.services_provider.dto.DtoMapper;
import com.services_provider.exception.DuplicateSubServiceNameException;
import com.services_provider.exception.GeneralServiceNotExistException;
import com.services_provider.exception.TechnicianNotConfirmedYetException;
import com.services_provider.model.*;
import com.services_provider.model.enumeration.TechnicianStatus;
import com.services_provider.repository.AdminRepository;
import com.services_provider.service.*;
import com.services_provider.util.ApplicationContext;

import java.util.List;

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
    public List<GeneralService> generalServicesListByAdmin() {
        return ApplicationContext.getGeneralService_Service().findAll();
    }

    @Override
    public SubService addSubServiceByAdmin(SubService subService) {
        try {
            SubService subService1 = ApplicationContext.getSubService_Service().findSubServiceByName(subService.getSubServiceName());
            if (subService1 != null) throw new DuplicateSubServiceNameException("subService name already exist");
            if (subService.getGeneralService() == null)
                throw new GeneralServiceNotExistException("General service no exist");
            return ApplicationContext.getSubService_Service().save(subService);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Technician addTechnicianByAdmin(Technician technician) {
        try {
            return ApplicationContext.getTechnicianService().save(technician);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
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

    @Override
    public List<Technician> seeTechnicianNotAcceptedByAdmin() {
        return ApplicationContext.getTechnicianService().findAll();
    }

    @Override
    public void addTechnicianToSubService(Technician technician, SubService subService) {
        try {
            subService.getTechnicianList().add(technician);
            if (technician.getTechnicianStatus().equals(TechnicianStatus.NEW))
                throw new TechnicianNotConfirmedYetException("technician not confirmed yet");
            ApplicationContext.getSubService_Service().update(subService);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

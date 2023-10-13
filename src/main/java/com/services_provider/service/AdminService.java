package com.services_provider.service;

import com.services_provider.base.service.BaseService;
import com.services_provider.model.Admin;
import com.services_provider.model.GeneralService;
import com.services_provider.model.SubService;
import com.services_provider.model.Technician;

public interface AdminService extends BaseService<Admin, Long> {
    GeneralService addGeneralServiceByAdmin(GeneralService generalService);

    SubService addSubServiceByAdmin(SubService subService);
    Technician addTechnicianByAdmin(Technician technician);
    void deleteTechnicianByAdmin(String userName);

    void changePassword(String userName, String password, String newPassword);
}

package com.services_provider;

import com.services_provider.model.*;
import com.services_provider.model.enumeration.AdminPosition;
import com.services_provider.model.enumeration.OrderStatus;
import com.services_provider.model.enumeration.TechnicianStatus;
import com.services_provider.util.ApplicationContext;
import com.services_provider.util.ImageConverter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //----------------  users -------------------//

        User user = new User("aa", "aa",
                "aa", "yyOs1#222",
                LocalDate.of(2000, 2, 2), "sss@sss.com");

        Admin admin = new Admin("admin", "admin", "admin",
                "A#dmin222", LocalDate.of(2000, 1, 1),
                "admin@admin.com", AdminPosition.MANAGER);

        Client client = new Client("mmd", "asghar", "asddsa",
                "1Q@eeeee", LocalDate.of(2000, 5, 5),
                "sss@sshs.com", 500D, "09999999999", "5022222222");


        byte[] image = ImageConverter.readFileToBytes("C:\\Users\\Administrator\\Desktop\\Temp\\sss.jpg");

        Technician technician = new Technician("rrr", "ttt", "tre", "wqw#2AAaaa",
                LocalDate.of(2000, 4, 4), "asd@asd.com", TechnicianStatus.NEW,
                image, 500D, "09103333333", "5555555555", "im good");

//        ApplicationContext.getUserService().save(user);
//        ApplicationContext.getAdminService().save(admin);
//        ApplicationContext.getClientService().save(client);
//        ApplicationContext.getTechnicianService().save(technician);

//        User user1 = ApplicationContext.getUserService().findById(1L);
//        Admin admin1 = ApplicationContext.getAdminService().findById(2L);
//        Client client1 = ApplicationContext.getClientService().findById(3L);
//        Technician technician1 = ApplicationContext.getTechnicianService().findById(4L);

//        user1.setFirstName("bb");
//        ApplicationContext.getUserService().update(user1);
//        admin1.setLastName("admin22");
//        ApplicationContext.getAdminService().update(admin1);
//        client1.setFirstName("reza");
//        ApplicationContext.getClientService().update(client1);
//        technician1.setAboutMe("im bad");
//        ApplicationContext.getTechnicianService().update(technician1);

//        ApplicationContext.getUserService().delete(user1);
//        ApplicationContext.getAdminService().delete(admin1);
//        ApplicationContext.getClientService().delete(client1);
//        ApplicationContext.getTechnicianService().delete(technician1);

//        ImageConverter.saveBytesToFile(technician1.getTechnicianPhoto(),
//                "C:\\Users\\Administrator\\Desktop\\Temp", "technician.jpg");

        //----------------  general service -------------------//

        GeneralService generalService = new GeneralService("sakhteman");

//        ApplicationContext.getGeneralService_Service().save(generalService);

//        GeneralService generalService1 = ApplicationContext.getGeneralService_Service().findById(1L);

//        generalService1.setServiceName("bargh");
//        ApplicationContext.getGeneralService_Service().update(generalService1);
//        ApplicationContext.getGeneralService_Service().delete(generalService1);

        //----------------  sub general service -------------------//

//        SubService subService = new SubService("barghe sakhteamn", 100000D,
//                "baray tamir bargh", ApplicationContext.getGeneralService_Service().findById(1L));
//
//        ApplicationContext.getSubService_Service().save(subService);
//
//        SubService subService1 = ApplicationContext.getSubService_Service().findById(1L);
//
//        subService1.setDescription("bargh sakhteaman ha");
//        subService1.setBasePrice(8000D);
//        ApplicationContext.getSubService_Service().update(subService1);
//
//        ApplicationContext.getSubService_Service().delete(subService1);

        //----------------  order service -------------------//


//        Order order = new Order(50000D, "qweqe",
//                LocalDateTime.of(2030, 5, 5, 15, 5, 5),
//                "khonamon", OrderStatus.WAITING_FOR_TECHNICIAN_OFFER,
//                ApplicationContext.getClientService().findById(3L),
//                ApplicationContext.getSubService_Service().findById(1L));
//
//        ApplicationContext.getOrderService().save(order);

//        Order order1 = ApplicationContext.getOrderService().findById(1L);

//        order1.setOrderAddress("home");
//        ApplicationContext.getOrderService().update(order1);


//        ApplicationContext.getOrderService().delete(order1);


        //----------------  offer service -------------------//

//        Offer offer = new Offer(LocalDateTime.of(2000, 5, 5, 15, 5, 5)
//                , LocalDateTime.of(2000, 6, 5, 15, 5, 5),
//                80000D, "12 days",
//                ApplicationContext.getTechnicianService().findById(4L),
//                ApplicationContext.getOrderService().findById(1L));
//
//        ApplicationContext.getOfferService().save(offer);

//        Offer offer1 = ApplicationContext.getOfferService().findById(1L);

//        offer1.setWorkDuration("14 days");
//        ApplicationContext.getOfferService().update(offer1);

//        ApplicationContext.getOfferService().delete(offer1);

        //----------------  viewpoint service -------------------//

//        ViewPoint viewPoint = new ViewPoint("awwwwli",4,
//                ApplicationContext.getTechnicianService().findById(4L));
//
//        ApplicationContext.getViewPointService().save(viewPoint);

//        ViewPoint viewPoint1 = ApplicationContext.getViewPointService().findById(1L);

//        viewPoint1.setScore(6);
//        ApplicationContext.getViewPointService().update(viewPoint1);

//        ApplicationContext.getViewPointService().delete(viewPoint1);

        //----------------  change password -------------------//

//        ApplicationContext.getClientService().changePassword("asddsa", "1Q@eeeee", "5@rRaaaa");

        //---------------- add general service and sub service by admin -------------------//

//        GeneralService generalService2 = new GeneralService("khodro");
//
//        ApplicationContext.getAdminService().addGeneralServiceByAdmin(generalService2);
//
//        SubService subService2 = new SubService("barghe khodro", 200000D,
//                "baray tamir khodro", ApplicationContext.getGeneralService_Service().findById(2L));
//
//        ApplicationContext.getAdminService().addSubServiceByAdmin(subService2);

//        SubService subService2 = new SubService("barghe khodro", 200000D,
//                "baray tamir khodro", ApplicationContext.getGeneralService_Service().findById(500L));
//
//        ApplicationContext.getAdminService().addSubServiceByAdmin(subService2);

        //---------------- delete and add technician by admin -------------------//

//        Technician technician2 = new Technician("ooo", "ooo", "ooo", "wqw#2Aoooo",
//                LocalDate.of(2009, 4, 4), "asd@aoo.com", TechnicianStatus.NEW,
//                image, 0D, "09103333333", "5555666666", "im good");
//
//        ApplicationContext.getAdminService().addTechnicianByAdmin(technician2);

//        ApplicationContext.getAdminService().deleteTechnicianByAdmin("ooo");

        //---------------- see all general services by admin -------------------//

//        System.out.println(ApplicationContext.getAdminService().generalServicesListByAdmin());

        //---------------- see all technicians by admin -------------------//

//        System.out.println(ApplicationContext.getAdminService().seeTechnicianNotAcceptedByAdmin());
//        Technician technician3 = ApplicationContext.getTechnicianService().findById(4L);
//        technician3.setTechnicianStatus(TechnicianStatus.CONFIRMED);
//        ApplicationContext.getTechnicianService().update(technician3);


//        Technician technician3 = ApplicationContext.getTechnicianService().findById(4L);
//        SubService subService3=ApplicationContext.getSubService_Service().findById(1L);
//        ApplicationContext.getAdminService().addTechnicianToSubService(technician3,subService3);


    }
}
package com.services_provider.model;

import com.services_provider.model.enumeration.TechnicianStatus;
import jakarta.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity
public class Technician extends User {
    @NotNull
    @Enumerated(EnumType.STRING)
    private TechnicianStatus technicianStatus;
    private Byte[] technicianPhoto;
    private Double technicianCredit;
    @Column(name = "phoneNumber")
    @NotNull
    private String phoneNumber;
    @Column(name = "nationalCode")
    @NotNull(message = "nationalCode cannot be null")
    @Size(min = 10, max = 10, message = "national code  must have 10 digits")
    private String nationalCode;
    @Size(min = 1, max = 200, message = "about Me must be between 1 to 200")
    private String aboutMe;
    @OneToMany(mappedBy = "technician")
    private List<ViewPoint> viewPointList;
    @ManyToMany(mappedBy = "technicianList")
    private List<SubService> subServiceList;
    @OneToMany(mappedBy = "technician")
    private List<Offer> offerList;
}

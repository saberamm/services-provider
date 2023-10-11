package com.services_provider.model;

import com.services_provider.base.model.BaseModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class SubService extends BaseModel<Long> {
    private String subServiceName;
    private Double basePrice;
    private String description;
    @ManyToMany
    @JoinTable(
            name = "technician_subservice",
            joinColumns = @JoinColumn(name = "technician"),
            inverseJoinColumns = @JoinColumn(name = "technician_id")
    )
    private List<Technician> technicianList;
    @OneToMany(mappedBy = "subService")
    private List<Order> orderList;
    @ManyToOne(cascade = CascadeType.ALL)
    private Service service;
}

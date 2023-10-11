package com.services_provider.model;

import com.services_provider.base.model.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Service extends BaseModel<Long> {
    @Column(unique = true)
    private String serviceName;
    @OneToMany(mappedBy = "service")
    private List<SubService> subServiceList;
}

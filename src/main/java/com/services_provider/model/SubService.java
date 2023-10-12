package com.services_provider.model;

import com.services_provider.base.model.BaseModel;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

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
    private GeneralService generalService;

    public SubService(String subServiceName, Double basePrice, String description, GeneralService generalService) {
        this.subServiceName = subServiceName;
        this.basePrice = basePrice;
        this.description = description;
        this.generalService = generalService;
    }

    public SubService() {
    }

    public String getSubServiceName() {
        return subServiceName;
    }

    public void setSubServiceName(String subServiceName) {
        this.subServiceName = subServiceName;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Technician> getTechnicianList() {
        return technicianList;
    }

    public void setTechnicianList(List<Technician> technicianList) {
        this.technicianList = technicianList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public GeneralService getGeneralService() {
        return generalService;
    }

    public void setGeneralService(GeneralService generalService) {
        this.generalService = generalService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubService that = (SubService) o;
        return Objects.equals(subServiceName, that.subServiceName) && Objects.equals(basePrice, that.basePrice) && Objects.equals(description, that.description) && Objects.equals(technicianList, that.technicianList) && Objects.equals(orderList, that.orderList) && Objects.equals(generalService, that.generalService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subServiceName, basePrice, description, technicianList, orderList, generalService);
    }

    @Override
    public String toString() {
        return "SubService{" +
                "id=" + getId() +
                ", subServiceName='" + subServiceName + '\'' +
                ", basePrice=" + basePrice +
                ", description='" + description + '\'' +
                ", service=" + generalService +
                '}';
    }
}

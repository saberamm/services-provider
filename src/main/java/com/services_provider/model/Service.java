package com.services_provider.model;

import com.services_provider.base.model.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Objects;

@Entity
public class Service extends BaseModel<Long> {
    @Column(unique = true)
    private String serviceName;
    @OneToMany(mappedBy = "service")
    private List<SubService> subServiceList;

    public Service(String serviceName, List<SubService> subServiceList) {
        this.serviceName = serviceName;
        this.subServiceList = subServiceList;
    }

    public Service() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public List<SubService> getSubServiceList() {
        return subServiceList;
    }

    public void setSubServiceList(List<SubService> subServiceList) {
        this.subServiceList = subServiceList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(serviceName, service.serviceName) && Objects.equals(subServiceList, service.subServiceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, subServiceList);
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + getId() +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}

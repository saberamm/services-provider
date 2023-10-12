package com.services_provider.model;

import com.services_provider.base.model.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity
public class GeneralService extends BaseModel<Long> {
    @Column(unique = true)
    @NotNull
    private String serviceName;
    @OneToMany(mappedBy = "generalService")
    private List<SubService> subServiceList;

    public GeneralService(String serviceName) {
        this.serviceName = serviceName;
    }

    public GeneralService() {
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
        GeneralService generalService = (GeneralService) o;
        return Objects.equals(serviceName, generalService.serviceName) && Objects.equals(subServiceList, generalService.subServiceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, subServiceList);
    }

    @Override
    public String toString() {
        return "generalService{" +
                "id=" + getId() +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}

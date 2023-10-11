package com.services_provider.model;

import com.services_provider.base.model.BaseModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
@Entity
public class ViewPoint extends BaseModel<Long> {
    private String comment;
    @Min(value = 1,message = "score must be between 1 to 10")
    @Max(value = 10,message = "score must be between 1 to 10")
    private Integer score;
    @ManyToOne(cascade = CascadeType.ALL)
    private Technician technician;
}

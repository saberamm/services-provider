package com.services_provider.model;

import com.services_provider.base.model.BaseModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
@Entity
public class Offer extends BaseModel<Long> {
    private LocalDateTime timeOfferُSent;
    private LocalDateTime timeForStartWorking;
    private Double suggestionPrice;
    private String WorkDuration;
    @ManyToOne(cascade = CascadeType.ALL)
    private Technician technician;
    @ManyToOne(cascade = CascadeType.ALL)
    private Order order;
}

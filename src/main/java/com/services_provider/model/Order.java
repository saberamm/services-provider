package com.services_provider.model;

import com.services_provider.base.model.BaseModel;
import com.services_provider.model.enumeration.OrderStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import javax.validation.constraints.FutureOrPresent;
import java.time.LocalDateTime;
import java.util.List;
@Entity
public class Order extends BaseModel<Long> {
    private Double orderPrice;
    private String orderDescription;
    @FutureOrPresent
    private LocalDateTime workTime;
    private String orderAddress;
    private OrderStatus orderStatus;
    @OneToMany(mappedBy = "order")
    private List<Offer> offerList;
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;
    @ManyToOne(cascade = CascadeType.ALL)
    private SubService subService;
}

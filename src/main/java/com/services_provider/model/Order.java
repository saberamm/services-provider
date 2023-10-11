package com.services_provider.model;

import com.services_provider.model.enumeration.OrderStatus;

import javax.validation.constraints.FutureOrPresent;
import java.time.LocalDateTime;

public class Order {
    private Double orderPrice;
    private String workDescription;
    @FutureOrPresent
    private LocalDateTime workTime;
    private String workAddress;
    private OrderStatus orderStatus;
}

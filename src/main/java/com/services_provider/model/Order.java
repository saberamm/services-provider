package com.services_provider.model;

import com.services_provider.base.model.BaseModel;
import com.services_provider.model.enumeration.OrderStatus;
import jakarta.persistence.*;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "order_table")
public class Order extends BaseModel<Long> {
    @NotNull
    private Double orderPrice;
    private String orderDescription;
    @FutureOrPresent
    private LocalDateTime workTime;
    @NotNull
    private String orderAddress;
    private OrderStatus orderStatus;
    @OneToMany(mappedBy = "order")
    private List<Offer> offerList;
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;
    @ManyToOne(cascade = CascadeType.ALL)
    private SubService subService;

    public Order(Double orderPrice, String orderDescription, LocalDateTime workTime, String orderAddress, OrderStatus orderStatus, Client client, SubService subService) {
        this.orderPrice = orderPrice;
        this.orderDescription = orderDescription;
        this.workTime = workTime;
        this.orderAddress = orderAddress;
        this.orderStatus = orderStatus;
        this.client = client;
        this.subService = subService;
    }

    public Order(Double orderPrice, String orderDescription, LocalDateTime workTime, String orderAddress, OrderStatus orderStatus, SubService subService) {
        this.orderPrice = orderPrice;
        this.orderDescription = orderDescription;
        this.workTime = workTime;
        this.orderAddress = orderAddress;
        this.orderStatus = orderStatus;
        this.subService = subService;
    }

    public Order(Double orderPrice, String orderDescription, LocalDateTime workTime, String orderAddress, OrderStatus orderStatus) {
        this.orderPrice = orderPrice;
        this.orderDescription = orderDescription;
        this.workTime = workTime;
        this.orderAddress = orderAddress;
        this.orderStatus = orderStatus;
    }

    public Order(Double orderPrice, String orderDescription, LocalDateTime workTime, String orderAddress, Client client, SubService subService) {
        this.orderPrice = orderPrice;
        this.orderDescription = orderDescription;
        this.workTime = workTime;
        this.orderAddress = orderAddress;
        this.client = client;
        this.subService = subService;
    }
    public Order() {
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public LocalDateTime getWorkTime() {
        return workTime;
    }

    public void setWorkTime(LocalDateTime workTime) {
        this.workTime = workTime;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Offer> getOfferList() {
        return offerList;
    }

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public SubService getSubService() {
        return subService;
    }

    public void setSubService(SubService subService) {
        this.subService = subService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderPrice, order.orderPrice) && Objects.equals(orderDescription, order.orderDescription) && Objects.equals(workTime, order.workTime) && Objects.equals(orderAddress, order.orderAddress) && orderStatus == order.orderStatus && Objects.equals(offerList, order.offerList) && Objects.equals(client, order.client) && Objects.equals(subService, order.subService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderPrice, orderDescription, workTime, orderAddress, orderStatus, offerList, client, subService);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + getId() +
                ", orderPrice=" + orderPrice +
                ", orderDescription='" + orderDescription + '\'' +
                ", workTime=" + workTime +
                ", orderAddress='" + orderAddress + '\'' +
                ", orderStatus=" + orderStatus +
                ", client=" + client +
                ", subService=" + subService +
                '}';
    }
}

package com.services_provider.model;

import com.services_provider.base.model.BaseModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.Objects;

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

    public Offer(LocalDateTime timeOfferُSent, LocalDateTime timeForStartWorking, Double suggestionPrice, String workDuration, Technician technician, Order order) {
        this.timeOfferُSent = timeOfferُSent;
        this.timeForStartWorking = timeForStartWorking;
        this.suggestionPrice = suggestionPrice;
        WorkDuration = workDuration;
        this.technician = technician;
        this.order = order;
    }

    public Offer() {
    }

    public LocalDateTime getTimeOfferُSent() {
        return timeOfferُSent;
    }

    public void setTimeOfferُSent(LocalDateTime timeOfferُSent) {
        this.timeOfferُSent = timeOfferُSent;
    }

    public LocalDateTime getTimeForStartWorking() {
        return timeForStartWorking;
    }

    public void setTimeForStartWorking(LocalDateTime timeForStartWorking) {
        this.timeForStartWorking = timeForStartWorking;
    }

    public Double getSuggestionPrice() {
        return suggestionPrice;
    }

    public void setSuggestionPrice(Double suggestionPrice) {
        this.suggestionPrice = suggestionPrice;
    }

    public String getWorkDuration() {
        return WorkDuration;
    }

    public void setWorkDuration(String workDuration) {
        WorkDuration = workDuration;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return Objects.equals(timeOfferُSent, offer.timeOfferُSent) && Objects.equals(timeForStartWorking, offer.timeForStartWorking) && Objects.equals(suggestionPrice, offer.suggestionPrice) && Objects.equals(WorkDuration, offer.WorkDuration) && Objects.equals(technician, offer.technician) && Objects.equals(order, offer.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeOfferُSent, timeForStartWorking, suggestionPrice, WorkDuration, technician, order);
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + getId() +
                ", timeOfferُSent=" + timeOfferُSent +
                ", timeForStartWorking=" + timeForStartWorking +
                ", suggestionPrice=" + suggestionPrice +
                ", WorkDuration='" + WorkDuration + '\'' +
                ", technician=" + technician +
                ", order=" + order +
                ", workDuration='" + getWorkDuration() + '\'' +
                '}';
    }
}

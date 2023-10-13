package com.services_provider.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
public class Client extends User{
    private Double clientCredit;
    @Column(name = "phoneNumber")
    @NotNull
    private String phoneNumber;
    @Column(name = "nationalCode",unique = true)
    @NotNull(message = "nationalCode cannot be null")
    @Size(min = 10, max = 10, message = "national code  must have 10 digits")
    private String nationalCode;
    @OneToMany(mappedBy = "client")
    private List<Order> orderList;

    public Client(Double clientCredit, String phoneNumber, String nationalCode) {
        this.clientCredit = clientCredit;
        this.phoneNumber = phoneNumber;
        this.nationalCode = nationalCode;
    }

    public Client(String firstName, String lastName, String userName, String password, LocalDate birthDate, String email, Double clientCredit, String phoneNumber, String nationalCode) {
        super(firstName, lastName, userName, password, birthDate, email);
        this.clientCredit = clientCredit;
        this.phoneNumber = phoneNumber;
        this.nationalCode = nationalCode;
    }

    public Client() {
    }

    public Double getClientCredit() {
        return clientCredit;
    }

    public void setClientCredit(Double clientCredit) {
        this.clientCredit = clientCredit;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return Objects.equals(clientCredit, client.clientCredit) && Objects.equals(phoneNumber, client.phoneNumber) && Objects.equals(nationalCode, client.nationalCode) && Objects.equals(orderList, client.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), clientCredit, phoneNumber, nationalCode, orderList);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + getId() +
                ", clientCredit=" + clientCredit +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", signUpDate=" + getSignUpDate() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", userName='" + getUserName() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", birthDate=" + getBirthDate() +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}

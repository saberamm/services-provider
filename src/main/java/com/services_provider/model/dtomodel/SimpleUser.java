package com.services_provider.model.dtomodel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class SimpleUser {

    private String firstName;
    private String lastName;
    private String userName;
    private LocalDate birthDate;
    private String email;
    private LocalDateTime signUpDate;

    public SimpleUser() {
    }

    public LocalDateTime getSignUpDate() {
        return signUpDate;
    }

    public void setSignUpDate(LocalDateTime signUpDate) {
        this.signUpDate = signUpDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleUser that = (SimpleUser) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(userName, that.userName) && Objects.equals(birthDate, that.birthDate) && Objects.equals(email, that.email) && Objects.equals(signUpDate, that.signUpDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, userName, birthDate, email, signUpDate);
    }

    @Override
    public String toString() {
        return "SimpleUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", signUpDate=" + signUpDate +
                '}';
    }
}


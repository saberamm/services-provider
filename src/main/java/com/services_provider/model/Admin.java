package com.services_provider.model;

import com.services_provider.model.enumeration.AdminPosition;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Admin extends User {
    @NotNull
    @Enumerated(EnumType.STRING)
    private AdminPosition position;

    public Admin(AdminPosition position) {
        this.position = position;
    }

    public Admin(String firstName, String lastName, String userName, String password, LocalDate birthDate, String email, AdminPosition position) {
        super(firstName, lastName, userName, password, birthDate, email);
        this.position = position;
    }

    public Admin() {
    }

    public AdminPosition getPosition() {
        return position;
    }

    public void setPosition(AdminPosition position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Admin admin = (Admin) o;
        return position == admin.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), position);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + getId() +
                ", position=" + position +
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

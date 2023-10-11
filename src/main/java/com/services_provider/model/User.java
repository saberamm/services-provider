package com.services_provider.model;

import com.services_provider.base.model.BaseModel;
import com.services_provider.validation.annotation.Password;
import jakarta.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "user_table")
public class User extends BaseModel<Long> {
    @NotNull(message = "Name can not be null")
    private String firstName;
    @NotNull(message = "Lastname can not be null")
    private String lastName;
    @NotNull(message = "username can not be null")
    @Column(unique = true)
    private String userName;
    @Password
    @NotNull(message = "Password cannot be null")
    private String password;
    @NotNull(message = "BirthDate cannot be null")
    private LocalDate birthDate;
    @Column(unique = true)
    @NotNull(message = "email cannot be null")
    @Email(regexp = "(?i)^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, String userName, String password, LocalDate birthDate, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.birthDate = birthDate;
        this.email = email;
    }

    public @NotNull(message = "Name can not be null") String getFirstName() {
        return this.firstName;
    }

    public @NotNull(message = "Lastname can not be null") String getLastName() {
        return this.lastName;
    }

    public @NotNull(message = "username can not be null") String getUserName() {
        return this.userName;
    }

    public @NotNull(message = "Password cannot be null") String getPassword() {
        return this.password;
    }

    public @NotNull(message = "BirthDate cannot be null") LocalDate getBirthDate() {
        return this.birthDate;
    }

    public @NotNull(message = "email cannot be null") @Email(regexp = "(?i)^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$") String getEmail() {
        return this.email;
    }

    public void setFirstName(@NotNull(message = "Name can not be null") String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(@NotNull(message = "Lastname can not be null") String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(@NotNull(message = "username can not be null") String userName) {
        this.userName = userName;
    }

    public void setPassword(@NotNull(message = "Password cannot be null") String password) {
        this.password = password;
    }

    public void setBirthDate(@NotNull(message = "BirthDate cannot be null") LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(@NotNull(message = "email cannot be null") @Email(regexp = "(?i)^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$") String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(userName, user.userName) && Objects.equals(password, user.password) && Objects.equals(birthDate, user.birthDate) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, userName, password, birthDate, email);
    }
}

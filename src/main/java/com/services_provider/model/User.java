package com.services_provider.model;

import com.services_provider.base.model.BaseModel;
import jakarta.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @Column(unique = true)
    private String username;
    @Size(min = 8, max = 50, message = "Password must be between 8 and 50 characters")
    @NotNull(message = "Password cannot be null")
    private String password;
    @NotNull(message = "BirthDate cannot be null")
    private LocalDate birthDate;

    public User() {
    }

    public User(String firstName, String lastName, String username, String password, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
    }

    public User(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(birthDate, user.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, username, password, birthDate);
    }

    public static class UserBuilder {
        private @NotNull(message = "Name can not be null") String firstName;
        private @NotNull(message = "Lastname can not be null") String lastName;
        private String username;
        private @Size(min = 8, max = 50, message = "Password must be between 8 and 50 characters") @NotNull(message = "Password cannot be null") String password;
        private @NotNull(message = "BirthDate cannot be null") LocalDate birthDate;

        UserBuilder() {
        }

        public UserBuilder firstName(@NotNull(message = "Name can not be null") String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(@NotNull(message = "Lastname can not be null") String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder password(@Size(min = 8, max = 50, message = "Password must be between 8 and 50 characters") @NotNull(message = "Password cannot be null") String password) {
            this.password = password;
            return this;
        }

        public UserBuilder birthDate(@NotNull(message = "BirthDate cannot be null") LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public User build() {
            return new User(firstName, lastName, username, password, birthDate);
        }

        public String toString() {
            return "User.UserBuilder(firstName=" + this.firstName + ", lastName=" + this.lastName + ", username=" + this.username + ", password=" + this.password + ", birthDate=" + this.birthDate + ")";
        }
    }
}

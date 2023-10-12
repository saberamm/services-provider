package com.services_provider.model;

import com.services_provider.model.enumeration.TechnicianStatus;
import jakarta.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity
public class Technician extends User {
    @NotNull
    @Enumerated(EnumType.STRING)
    private TechnicianStatus technicianStatus;
    private byte[] technicianPhoto;
    private Double technicianCredit;
    @Column(name = "phoneNumber")
    @NotNull
    @Size(min = 11, max = 11, message = "phoneNumber  must have 11 digits")
    private String phoneNumber;
    @Column(name = "nationalCode")
    @NotNull(message = "nationalCode cannot be null")
    @Size(min = 10, max = 10, message = "national code  must have 10 digits")
    private String nationalCode;
    @Size(min = 1, max = 200, message = "about Me must be between 1 to 200")
    private String aboutMe;
    @OneToMany(mappedBy = "technician")
    private List<ViewPoint> viewPointList;
    @ManyToMany(mappedBy = "technicianList")
    private List<SubService> subServiceList;
    @OneToMany(mappedBy = "technician")
    private List<Offer> offerList;

    public Technician(TechnicianStatus technicianStatus, byte[] technicianPhoto, Double technicianCredit, String phoneNumber, String nationalCode, String aboutMe) {
        this.technicianStatus = technicianStatus;
        this.technicianPhoto = technicianPhoto;
        this.technicianCredit = technicianCredit;
        this.phoneNumber = phoneNumber;
        this.nationalCode = nationalCode;
        this.aboutMe = aboutMe;
    }

    public Technician(String firstName, String lastName, String userName, String password, LocalDate birthDate, String email, TechnicianStatus technicianStatus, byte[] technicianPhoto, Double technicianCredit, String phoneNumber, String nationalCode, String aboutMe) {
        super(firstName, lastName, userName, password, birthDate, email);
        this.technicianStatus = technicianStatus;
        this.technicianPhoto = technicianPhoto;
        this.technicianCredit = technicianCredit;
        this.phoneNumber = phoneNumber;
        this.nationalCode = nationalCode;
        this.aboutMe = aboutMe;
    }

    public Technician() {
    }

    public TechnicianStatus getTechnicianStatus() {
        return technicianStatus;
    }

    public void setTechnicianStatus(TechnicianStatus technicianStatus) {
        this.technicianStatus = technicianStatus;
    }

    public byte[] getTechnicianPhoto() {
        return technicianPhoto;
    }

    public void setTechnicianPhoto(byte[] technicianPhoto) {
        this.technicianPhoto = technicianPhoto;
    }

    public Double getTechnicianCredit() {
        return technicianCredit;
    }

    public void setTechnicianCredit(Double technicianCredit) {
        this.technicianCredit = technicianCredit;
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

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public List<ViewPoint> getViewPointList() {
        return viewPointList;
    }

    public void setViewPointList(List<ViewPoint> viewPointList) {
        this.viewPointList = viewPointList;
    }

    public List<SubService> getSubServiceList() {
        return subServiceList;
    }

    public void setSubServiceList(List<SubService> subServiceList) {
        this.subServiceList = subServiceList;
    }

    public List<Offer> getOfferList() {
        return offerList;
    }

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Technician that = (Technician) o;
        return technicianStatus == that.technicianStatus && Arrays.equals(technicianPhoto, that.technicianPhoto) && Objects.equals(technicianCredit, that.technicianCredit) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(nationalCode, that.nationalCode) && Objects.equals(aboutMe, that.aboutMe) && Objects.equals(viewPointList, that.viewPointList) && Objects.equals(subServiceList, that.subServiceList) && Objects.equals(offerList, that.offerList);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), technicianStatus, technicianCredit, phoneNumber, nationalCode, aboutMe, viewPointList, subServiceList, offerList);
        result = 31 * result + Arrays.hashCode(technicianPhoto);
        return result;
    }

    @Override
    public String toString() {
        return "Technician{" +
                "id=" + getId() +
                ", technicianStatus=" + technicianStatus +
                ", technicianCredit=" + technicianCredit +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", aboutMe='" + aboutMe + '\'' +
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

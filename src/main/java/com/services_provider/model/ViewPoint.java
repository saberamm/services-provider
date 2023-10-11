package com.services_provider.model;

import com.services_provider.base.model.BaseModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Objects;

@Entity
public class ViewPoint extends BaseModel<Long> {
    private String comment;
    @Min(value = 1,message = "score must be between 1 to 10")
    @Max(value = 10,message = "score must be between 1 to 10")
    private Integer score;
    @ManyToOne(cascade = CascadeType.ALL)
    private Technician technician;

    public ViewPoint(String comment, Integer score, Technician technician) {
        this.comment = comment;
        this.score = score;
        this.technician = technician;
    }

    public ViewPoint() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewPoint viewPoint = (ViewPoint) o;
        return Objects.equals(comment, viewPoint.comment) && Objects.equals(score, viewPoint.score) && Objects.equals(technician, viewPoint.technician);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, score, technician);
    }

    @Override
    public String toString() {
        return "ViewPoint{" +
                "id=" + getId() +
                ", comment='" + comment + '\'' +
                ", score=" + score +
                ", technician=" + technician +
                '}';
    }
}

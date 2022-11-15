package com.homewebside.homewebsidebackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "assignments")
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "assignment_id", nullable = false)
    private int assignmentId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;
    @ManyToOne
    @JoinColumn(name = "pla_color_id", nullable = false)
    private PlaColor plaColorId;

    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private AssignmentStatus status;

    @ManyToOne
    @JoinColumn(name = "payment_status_id", nullable = false)
    private PaymentStatus paymentStatus;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;
    
    @Column(name = "infill",nullable = false)
    private int infill;

    @Column(name = "filament_weight")
    private float filamentWeight;

    @Column(name = "hours")
    private float hours;

    @Column(name = "versand", nullable = false)
    private boolean versand;

    public Assignment(User user, PlaColor plaColor, AssignmentStatus status, PaymentStatus paymentStatus, String title, String description,int infill, boolean versand) {
        this.userId = user;
        this.plaColorId = plaColor;
        this.status = status;
        this.paymentStatus = paymentStatus;
        this.title = title;
        this.description = description;
        this.infill = infill;
        this.versand = versand;
    }

    public int getInfill() {
        return infill;
    }

    public void setInfill(int infill) {
        this.infill = infill;
    }

    public boolean isVersand() {
        return versand;
    }

    public boolean getVersand() {
        return versand;
    }

    public void setVersand(boolean versand) {
        this.versand = versand;
    }

    public Assignment() {
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public User getUser() {
        return userId;
    }

    public void setUser(User user) {
        this.userId = user;
    }

    public PlaColor getPlaColor() {
        return plaColorId;
    }

    public void setPlaColor(PlaColor plaColor) {
        this.plaColorId = plaColor;
    }

    public AssignmentStatus getStatus() {
        return status;
    }

    public void setStatus(AssignmentStatus status) {
        this.status = status;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public PlaColor getPlaColorId() {
        return plaColorId;
    }

    public void setPlaColorId(PlaColor plaColorId) {
        this.plaColorId = plaColorId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getFilamentWeight() {
        return filamentWeight;
    }

    public void setFilamentWeight(float filamentLength) {
        this.filamentWeight = filamentLength;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float wattHours) {
        this.hours = wattHours;
    }




    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId=" + assignmentId +
                ", user=" + userId +
                ", plaColor=" + plaColorId +
                ", status='" + status + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", filamentLength=" + filamentWeight +
                ", wattHours=" + hours +
                '}';
    }
}

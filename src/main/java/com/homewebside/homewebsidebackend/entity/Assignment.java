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

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "filament_length")
    private float filamentLength;

    @Column(name = "watt_hours")
    private float wattHours;

    @Column(name = "is_payed", nullable = false)
    private boolean isPayed;

    public Assignment(User user, PlaColor plaColor,AssignmentStatus status, String title, String description, boolean isPayed) {
        this.userId = user;
        this.plaColorId = plaColor;
        this.status = status;
        this.title = title;
        this.description = description;
        this.isPayed = isPayed;
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

    public float getFilamentLength() {
        return filamentLength;
    }

    public void setFilamentLength(float filamentLength) {
        this.filamentLength = filamentLength;
    }

    public float getWattHours() {
        return wattHours;
    }

    public void setWattHours(float wattHours) {
        this.wattHours = wattHours;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(boolean payed) {
        isPayed = payed;
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
                ", filamentLength=" + filamentLength +
                ", wattHours=" + wattHours +
                ", isPayed=" + isPayed +
                '}';
    }
}

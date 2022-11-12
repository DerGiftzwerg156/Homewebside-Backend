package com.homewebside.homewebsidebackend.entity;

public class AssignmentReplyData {
    private int assignmentId;
    private PlaColor plaColor;
    private String status;
    private String title;
    private String description;
    private float filamentLength;
    private float wattHours;
    private boolean isPayed;

    public AssignmentReplyData(int assignmentId, PlaColor plaColor, String status, String title, String description, float filamentLength, float wattHours, boolean isPayed) {
        this.assignmentId = assignmentId;
        this.plaColor = plaColor;
        this.status = status;
        this.title = title;
        this.description = description;
        this.filamentLength = filamentLength;
        this.wattHours = wattHours;
        this.isPayed = isPayed;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public PlaColor getPlaColor() {
        return plaColor;
    }

    public void setPlaColor(PlaColor plaColor) {
        this.plaColor = plaColor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }
}
package com.homewebside.homewebsidebackend.entity;

public class AssignmentReplyData {
    private int assignmentId;
    private PlaColor plaColor;
    private AssignmentStatus status;
    private PaymentStatus paymentStatus;
    private String title;
    private String description;
    private float filamentLength;
    private float wattHours;

    private double price;

    public AssignmentReplyData(int assignmentId, PlaColor plaColor, AssignmentStatus status, PaymentStatus paymentStatus, String title, String description, float filamentLength, float wattHours, double price) {
        this.assignmentId = assignmentId;
        this.plaColor = plaColor;
        this.status = status;
        this.paymentStatus = paymentStatus;
        this.title = title;
        this.description = description;
        this.filamentLength = filamentLength;
        this.wattHours = wattHours;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
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
}
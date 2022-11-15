package com.homewebside.homewebsidebackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "payment_status")
public class PaymentStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_status_id", nullable = false)
    private int paymentStatusId;

    @Column(name = "payment_status", nullable = false)
    private String paymentStatus;

    @Column(name = "payment_status_code", nullable = false)
    private int paymentStatusCode;

    public PaymentStatus(int paymentStatusId, String paymentStatus, int paymentStatusCode) {
        this.paymentStatusId = paymentStatusId;
        this.paymentStatus = paymentStatus;
        this.paymentStatusCode = paymentStatusCode;
    }

    public PaymentStatus() {
    }

    public int getPaymentStatusId() {
        return paymentStatusId;
    }

    public void setPaymentStatusId(int paymentStatusId) {
        this.paymentStatusId = paymentStatusId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getPaymentStatusCode() {
        return paymentStatusCode;
    }

    public void setPaymentStatusCode(int paymentStatusCode) {
        this.paymentStatusCode = paymentStatusCode;
    }
}

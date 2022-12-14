package com.homewebside.homewebsidebackend.replyes;

import com.homewebside.homewebsidebackend.entity.AssignmentStatus;
import com.homewebside.homewebsidebackend.entity.PaymentStatus;

public class StatusesReply {
    private AssignmentStatus[] assignmentStatus;
    private PaymentStatus[] paymentStatus;

    private Reply reply;

    public StatusesReply(AssignmentStatus[] assignmentStatus, PaymentStatus[] paymentStatus, Reply reply) {
        this.assignmentStatus = assignmentStatus;
        this.paymentStatus = paymentStatus;
        this.reply = reply;
    }

    public StatusesReply() {
    }

    public AssignmentStatus[] getAssignmentStatus() {
        return assignmentStatus;
    }

    public void setAssignmentStatus(AssignmentStatus[] assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    public PaymentStatus[] getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus[] paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }
}

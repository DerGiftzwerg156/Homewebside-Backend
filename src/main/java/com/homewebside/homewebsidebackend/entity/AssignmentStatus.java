package com.homewebside.homewebsidebackend.entity;

import org.checkerframework.checker.units.qual.C;

import javax.persistence.*;

@Entity
@Table(name = "assignment_status")
public class AssignmentStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "status_id", nullable = false)
    private int assignmentStatusId;

    @Column(name = "status", nullable = false)
    private String assignmentStatus;

    @Column(name = "statusCode", nullable = false)
    private int statusCode;

    public AssignmentStatus(int assignmentStatusId, String assignmentStatus, int statusCode) {
        this.assignmentStatusId = assignmentStatusId;
        this.assignmentStatus = assignmentStatus;
        this.statusCode = statusCode;
    }

    public AssignmentStatus() {
    }

    public int getAssignmentStatusId() {
        return assignmentStatusId;
    }

    public void setAssignmentStatusId(int assignmentStatusId) {
        this.assignmentStatusId = assignmentStatusId;
    }

    public String getAssignmentStatus() {
        return assignmentStatus;
    }

    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}

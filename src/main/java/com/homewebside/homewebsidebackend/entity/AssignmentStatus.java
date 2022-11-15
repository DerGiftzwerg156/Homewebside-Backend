package com.homewebside.homewebsidebackend.entity;

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

    @Column(name = "status_code", nullable = false)
    private int assignmentStatusCode;

    public AssignmentStatus(int assignmentStatusId, String assignmentStatus, int assignmentStatusCode) {
        this.assignmentStatusId = assignmentStatusId;
        this.assignmentStatus = assignmentStatus;
        this.assignmentStatusCode = assignmentStatusCode;
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

    public int getAssignmentStatusCode() {
        return assignmentStatusCode;
    }

    public void setAssignmentStatusCode(int assignmentStatusCode) {
        this.assignmentStatusCode = assignmentStatusCode;
    }
}

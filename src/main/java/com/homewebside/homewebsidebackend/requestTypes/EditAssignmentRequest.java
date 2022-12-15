package com.homewebside.homewebsidebackend.requestTypes;

import com.homewebside.homewebsidebackend.entity.AssignmentReplyData;

public class EditAssignmentRequest {

    private int assignmentId;
    private float hours;
    private float filamentLength;

    private int statusCode;
    private StandardRequest request;

    public EditAssignmentRequest(int assignmentId, float hours, float filamentLength, int statusCode, StandardRequest request) {
        this.assignmentId = assignmentId;
        this.hours = hours;
        this.filamentLength = filamentLength;
        this.statusCode = statusCode;
        this.request = request;
    }

    public EditAssignmentRequest() {
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public float getFilamentLength() {
        return filamentLength;
    }

    public void setFilamentLength(float filamentLength) {
        this.filamentLength = filamentLength;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public StandardRequest getRequest() {
        return request;
    }

    public void setRequest(StandardRequest request) {
        this.request = request;
    }
}

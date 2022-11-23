package com.homewebside.homewebsidebackend.replyes;

import com.homewebside.homewebsidebackend.entity.Assignment;

public class AssignmentReply {
    private Assignment[] assignments;
    private Reply reply;

    public AssignmentReply(Assignment[] assignments, Reply reply) {
        this.assignments = assignments;
        this.reply = reply;
    }

    public AssignmentReply() {
    }

    public Assignment[] getAssignments() {
        return assignments;
    }

    public void setAssignments(Assignment[] assignments) {
        this.assignments = assignments;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }
}

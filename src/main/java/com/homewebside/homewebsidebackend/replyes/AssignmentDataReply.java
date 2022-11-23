package com.homewebside.homewebsidebackend.replyes;

import com.homewebside.homewebsidebackend.entity.AssignmentReplyData;

public class AssignmentDataReply {
    private AssignmentReplyData[] assignments;

    private Reply reply;

    public AssignmentDataReply(AssignmentReplyData[] assignments, Reply reply) {
        this.assignments = assignments;
        this.reply = reply;
    }

    public AssignmentReplyData[] getAssignments() {
        return assignments;
    }

    public void setAssignments(AssignmentReplyData[] assignments) {
        this.assignments = assignments;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }
}

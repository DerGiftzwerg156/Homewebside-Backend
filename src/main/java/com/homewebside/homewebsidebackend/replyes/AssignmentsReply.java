package com.homewebside.homewebsidebackend.replyes;

import com.homewebside.homewebsidebackend.entity.Assignment;
import com.homewebside.homewebsidebackend.entity.AssignmentReplyData;
import com.homewebside.homewebsidebackend.entity.PlaColor;

public class AssignmentsReply {
    private AssignmentReplyData[] assignments;

    private Reply reply;

    public AssignmentsReply(AssignmentReplyData[] assignments, Reply reply) {
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

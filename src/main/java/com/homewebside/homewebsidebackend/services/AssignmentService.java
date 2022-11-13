package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.*;
import com.homewebside.homewebsidebackend.interfaces.AssignmentStatusRepository;
import com.homewebside.homewebsidebackend.interfaces.AssignmentsRepository;
import com.homewebside.homewebsidebackend.interfaces.PlacolorsRepository;
import com.homewebside.homewebsidebackend.interfaces.TokenRepository;
import com.homewebside.homewebsidebackend.replyes.AssignmentsReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.requestTypes.NewAssignmentRequest;
import com.homewebside.homewebsidebackend.requestTypes.StandardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AssignmentService {

    @Autowired
    private TokenRepository tokenRepository;
    @Autowired
    private AssignmentsRepository assignmentsRepository;

    @Autowired
    private PlacolorsRepository plaColorRepository;

    @Autowired
    private AssignmentStatusRepository assignmentStatusRepository;

    @Autowired
    TokenService tokenService;

    public AssignmentsReply getAllUserAssignments(StandardRequest standardRequest) {
        if (tokenService.isTokenValid(standardRequest.getToken())) {
            if (tokenRepository.findByToken(standardRequest.getToken()) != null) {
                User user = tokenRepository.findByToken(standardRequest.getToken()).getUserid();
                List<Assignment> assignmentsList = assignmentsRepository.findAllByUserId(user);
                AssignmentReplyData[] assignments = new AssignmentReplyData[assignmentsList.size()];
                for (int i = 0; i < assignmentsList.size(); i++) {
                    Assignment assignment = assignmentsList.get(i);
                    AssignmentReplyData assignmentsReplyData = new AssignmentReplyData(assignment.getAssignmentId(), assignment.getPlaColor(), assignment.getStatus(), assignment.getTitle(), assignment.getDescription(), assignment.getFilamentLength(), assignment.getWattHours(), assignment.getIsPayed());
                    assignments[i] = assignmentsReplyData;
                }
                return new AssignmentsReply(assignments, new Reply("All Assignments found", true));
            }
            return new AssignmentsReply(null, new Reply("Failure", false));

        } else
            return new AssignmentsReply(null, new Reply("Token is Invalid, please login again!", false));

    }

    public Reply createNewAssignment(NewAssignmentRequest newAssignmentRequest) {
        if (tokenService.isTokenValid(newAssignmentRequest.getToken())) {
            if (tokenRepository.findByToken(newAssignmentRequest.getToken()) != null) {
                User user = tokenRepository.findByToken(newAssignmentRequest.getToken()).getUserid();
                PlaColor plaColor = plaColorRepository.findByColor(newAssignmentRequest.getColor());
                AssignmentStatus assignmentStatus = assignmentStatusRepository.findByStatusCode(101);
                Assignment assignment = new Assignment(user, plaColor, assignmentStatus, newAssignmentRequest.getTitle(), newAssignmentRequest.getDescription(), false);
                assignmentsRepository.save(assignment);
                return new Reply("Successfully created new Assignment", true);
            } else {
                return new Reply("Failure", false);
            }
        } else
            return new Reply("Token is Invalid, please login again!", false);
    }

}

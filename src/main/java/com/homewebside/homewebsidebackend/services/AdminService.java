package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.Assignment;
import com.homewebside.homewebsidebackend.interfaces.*;
import com.homewebside.homewebsidebackend.replyes.AssignmentReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.requestTypes.StandardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AssignmentsRepository assignmentsRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AssignmentStatusRepository assignmentStatusRepository;

    @Autowired
    private PaymentStatusCodeRepository paymentStatusCodeRepository;

    @Autowired
    private PlaColorsRepository placolorsRepository;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthService authService;


    public AssignmentReply getAllActiveAssignments(StandardRequest standardRequest) {
        if (tokenService.isTokenValid(standardRequest.getToken())) {
            if (authService.checkIfAdmin(standardRequest.getToken())) {
                List<Assignment> assignmentList = assignmentsRepository.findAll();
                Assignment[] assignments = new Assignment[assignmentList.size()];
                for (int i = 0; i < assignmentList.size(); i++) {
                    Assignment assignment = assignmentList.get(i);
                    assignments[i] = assignment;
                    return new AssignmentReply(assignments, new Reply("Successfully found all Assignments", true));
                }
            } else {
                return new AssignmentReply(null, new Reply("No Permissions", false));
            }
        } else {
            return new AssignmentReply(null, new Reply("Token invalid, pleas Login again", false));
        }
        return new AssignmentReply(null, new Reply("Failure", false));
    }
}

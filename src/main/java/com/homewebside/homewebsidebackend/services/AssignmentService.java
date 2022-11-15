package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.*;
import com.homewebside.homewebsidebackend.interfaces.*;
import com.homewebside.homewebsidebackend.replyes.AssignmentsReply;
import com.homewebside.homewebsidebackend.replyes.PlaColorReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.requestTypes.NewAssignmentRequest;
import com.homewebside.homewebsidebackend.requestTypes.StandardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AssignmentService {

    private double filamentCostPerGramm = 24.99 / 1000; //Kosten Filamentrolle / Gewicht
    private double powerCost = 0.075; //Cent Pro Stunde

    private double versandKosten = 3.99; //Versandkosten für ein kleines Päckchen

    @Autowired
    private TokenRepository tokenRepository;
    @Autowired
    private AssignmentsRepository assignmentsRepository;

    @Autowired
    private PlacolorsRepository plaColorRepository;

    @Autowired
    private AssignmentStatusRepository assignmentStatusRepository;

    @Autowired
    private PaymentStatusCodeRepository paymentStatusCodeRepository;

    @Autowired
    TokenService tokenService;

    private double round(double value) {
        double d = Math.pow(10, 2);
        return Math.round(value * d) / d;
    }

    public AssignmentsReply getAllUserAssignments(StandardRequest standardRequest) {
        if (tokenService.isTokenValid(standardRequest.getToken())) {
            if (tokenRepository.findByToken(standardRequest.getToken()) != null) {
                User user = tokenRepository.findByToken(standardRequest.getToken()).getUserid();
                List<Assignment> assignmentsList = assignmentsRepository.findAllByUserId(user);
                AssignmentReplyData[] assignments = new AssignmentReplyData[assignmentsList.size()];
                for (int i = 0; i < assignmentsList.size(); i++) {
                    Assignment assignment = assignmentsList.get(i);
                    double price = round(((assignment.getFilamentWeight() * filamentCostPerGramm) + (assignment.getHours() * powerCost)) * 1.75);
                    if (assignment.getVersand() && price < 100) {
                        price = price + versandKosten;
                    }
                    AssignmentReplyData assignmentsReplyData = new AssignmentReplyData(assignment.getAssignmentId(), assignment.getPlaColor(), assignment.getStatus(), assignment.getPaymentStatus(), assignment.getTitle(), assignment.getDescription(), assignment.getFilamentWeight(), assignment.getHours(), price);
                    assignments[i] = assignmentsReplyData;
                }
                return new AssignmentsReply(assignments, new Reply("All Assignments found", true));
            }
            return new AssignmentsReply(null, new Reply("Failure", false));

        } else
            return new AssignmentsReply(null, new Reply("Token is Invalid, please login again!", false));

    }

    public PlaColorReply getAllPlaColors() {
        PlaColorReply plaColorReply;
        List<PlaColor> plaColorList = plaColorRepository.findAll();
        PlaColor[] plaColors = new PlaColor[plaColorList.size()];
        for (int i = 0; i < plaColorList.size(); i++) {
            PlaColor plaColor = plaColorList.get(i);
            plaColors[i] = plaColor;
        }
        plaColorReply = new PlaColorReply(plaColors, new Reply("All Colors found successfully", true));
        return plaColorReply;
    }

    public Reply createNewAssignment(NewAssignmentRequest newAssignmentRequest) {
        System.out.println("Pla-Color: " +newAssignmentRequest.getPlaColor());
        if (tokenService.isTokenValid(newAssignmentRequest.getStandardRequest().getToken())) {
            if (tokenRepository.findByToken(newAssignmentRequest.getStandardRequest().getToken()) != null) {
                User user = tokenRepository.findByToken(newAssignmentRequest.getStandardRequest().getToken()).getUserid();
                PlaColor plaColor = plaColorRepository.findByColor(newAssignmentRequest.getPlaColor().getColor());
                AssignmentStatus assignmentStatus = assignmentStatusRepository.findByAssignmentStatusCode(101);
                PaymentStatus paymentStatus = paymentStatusCodeRepository.findByPaymentStatusCode(201);
                Assignment assignment = new Assignment(user, plaColor, assignmentStatus, paymentStatus, newAssignmentRequest.getTitle(), newAssignmentRequest.getDescription(), newAssignmentRequest.getInfill(), newAssignmentRequest.isVersand());
                assignmentsRepository.save(assignment);
                return new Reply("Successfully created new Assignment", true);
            } else {
                return new Reply("Failure", false);
            }
        } else
            return new Reply("Token is Invalid, please login again!", false);
    }

}

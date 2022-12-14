package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.replyes.AssignmentDataReply;
import com.homewebside.homewebsidebackend.replyes.ColorAndDeliveryOptionsReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.replyes.StatusesReply;
import com.homewebside.homewebsidebackend.requestTypes.NewAssignmentRequest;
import com.homewebside.homewebsidebackend.requestTypes.StandardRequest;
import com.homewebside.homewebsidebackend.services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/assignments")
@CrossOrigin
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @PostMapping("/getAllUserAssignments")
    private AssignmentDataReply getAllUserAssignments(@RequestBody StandardRequest standardRequest){
        return assignmentService.getAllUserAssignments(standardRequest);
    }

    @PostMapping("/getAllAssignments")
    private AssignmentDataReply getAllAssignments(@RequestBody StandardRequest standardRequest){
        return assignmentService.getAllAssignments(standardRequest);
    }

    @PostMapping("/createNewAssignment")
    private Reply createNewAssignment(@RequestBody NewAssignmentRequest newAssignmentRequest){
        return assignmentService.createNewAssignment(newAssignmentRequest);
    }

    @GetMapping("/getColorsAndDeliveryOptions")
    private ColorAndDeliveryOptionsReply getAllPlaColors(){
        return assignmentService.getAllPlaColors();
    }

    @GetMapping("/getStatuses")
    private StatusesReply getStatuses(){
        return assignmentService.getStatuses();
    }
}

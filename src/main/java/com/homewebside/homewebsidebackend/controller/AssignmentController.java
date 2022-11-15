package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.replyes.AssignmentsReply;
import com.homewebside.homewebsidebackend.replyes.PlaColorReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
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
    private AssignmentsReply getAllUserAssignments(@RequestBody StandardRequest standardRequest){
        return assignmentService.getAllUserAssignments(standardRequest);
    }

    @PostMapping("/createNewAssignment")
    private Reply createNewAssignment(@RequestBody NewAssignmentRequest newAssignmentRequest){
        return assignmentService.createNewAssignment(newAssignmentRequest);
    }

    @GetMapping("/getAllPlaColors")
    private PlaColorReply getAllPlaColors(){
        return assignmentService.getAllPlaColors();
    }
}

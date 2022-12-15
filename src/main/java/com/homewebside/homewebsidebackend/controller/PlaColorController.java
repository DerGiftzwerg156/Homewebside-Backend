package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.replyes.ColorReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.requestTypes.ChangePlaColorAvailability;
import com.homewebside.homewebsidebackend.requestTypes.NewPlaColor;
import com.homewebside.homewebsidebackend.requestTypes.StandardRequest;
import com.homewebside.homewebsidebackend.services.PlaColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/plaColors")
@CrossOrigin
public class PlaColorController {

    @Autowired
    private PlaColorService plaColorService;

    @GetMapping("/getAllPlaColors")
    private ColorReply getAllPlaColors() {
        return plaColorService.getAllPlaColors();
    }

    @PostMapping("/editPlaColorAvailability")
    private Reply editPlaColorAvailability(@RequestBody ChangePlaColorAvailability changePlaColorAvailability) {
        return plaColorService.editPlaColorAvailability(changePlaColorAvailability);
    }

    @PostMapping("/newPlaColor")
    private Reply addNewPlaColor(@RequestBody NewPlaColor newPlaColor) {
        return plaColorService.addNewPlaColor(newPlaColor);
    }
}

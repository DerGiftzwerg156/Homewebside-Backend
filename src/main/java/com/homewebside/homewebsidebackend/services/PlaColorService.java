package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.PlaColor;
import com.homewebside.homewebsidebackend.interfaces.PlaColorsRepository;
import com.homewebside.homewebsidebackend.replyes.ColorReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.requestTypes.ChangePlaColorAvailability;
import com.homewebside.homewebsidebackend.requestTypes.NewPlaColor;
import com.homewebside.homewebsidebackend.requestTypes.StandardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaColorService {

    @Autowired
    private PlaColorsRepository placolorsRepository;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthService authService;

    public ColorReply getAllPlaColors(StandardRequest standardRequest) {
        if (tokenService.isTokenValid(standardRequest.getToken())) {
            List<PlaColor> plaColorList = placolorsRepository.findAll();
            PlaColor[] plaColors = plaColorList.toArray(new PlaColor[0]);
            return new ColorReply(plaColors, new Reply("Success", true));
        } else
            return new ColorReply(null, new Reply("Token invalid", false));

    }

    public Reply editPlaColorAvailability(ChangePlaColorAvailability request) {
        if (tokenService.isTokenValid(request.getStandardRequest().getToken())) {
            PlaColor plaColor = placolorsRepository.findByPlaColorId(request.getPlaColor().getPlaColorId());
            plaColor.setAvailable(request.getPlaColor().isAvailable());
            placolorsRepository.save(plaColor);
            new Reply("Successfully changed Pla Color Status", true);
        }
        return new Reply("Token invalid", false);
    }

    public Reply addNewPlaColor(NewPlaColor newPlaColor) {
        if (tokenService.isTokenValid(newPlaColor.getStandardRequest().getToken())) {
            if (authService.checkIfAdmin(newPlaColor.getStandardRequest().getToken())) {
                PlaColor plaColor = new PlaColor(newPlaColor.getColorName(), true);
                placolorsRepository.save(plaColor);
                return new Reply("Success", true);
            } else {
                return new Reply("No Permissions", false);
            }
        } else {
            return new Reply("Token invalid", false);
        }
    }
}

package com.homewebside.homewebsidebackend.requestTypes;

import com.homewebside.homewebsidebackend.entity.PlaColor;

public class ChangePlaColorAvailability {

    private PlaColor plaColor;
    private StandardRequest standardRequest;

    public ChangePlaColorAvailability(PlaColor plaColor, StandardRequest standardRequest) {
        this.plaColor = plaColor;
        this.standardRequest = standardRequest;
    }

    public ChangePlaColorAvailability() {
    }

    public PlaColor getPlaColor() {
        return plaColor;
    }

    public void setPlaColor(PlaColor plaColor) {
        this.plaColor = plaColor;
    }

    public StandardRequest getStandardRequest() {
        return standardRequest;
    }

    public void setStandardRequest(StandardRequest standardRequest) {
        this.standardRequest = standardRequest;
    }
}

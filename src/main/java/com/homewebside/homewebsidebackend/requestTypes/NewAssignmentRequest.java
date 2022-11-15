package com.homewebside.homewebsidebackend.requestTypes;

import com.homewebside.homewebsidebackend.entity.PlaColor;

public class NewAssignmentRequest {
    private String title;
    private String description;

    private PlaColor plaColor;

    private boolean versand;

    private int infill;
    private StandardRequest standardRequest;

    public NewAssignmentRequest(String title, String description, PlaColor plaColor, boolean versand, int infill, StandardRequest standardRequest) {
        this.title = title;
        this.description = description;
        this.plaColor = plaColor;
        this.versand = versand;
        this.infill = infill;
        this.standardRequest = standardRequest;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PlaColor getPlaColor() {
        return plaColor;
    }

    public void setPlaColor(PlaColor plaColor) {
        this.plaColor = plaColor;
    }

    public boolean isVersand() {
        return versand;
    }

    public void setVersand(boolean versand) {
        this.versand = versand;
    }

    public int getInfill() {
        return infill;
    }

    public void setInfill(int infill) {
        this.infill = infill;
    }

    public StandardRequest getStandardRequest() {
        return standardRequest;
    }

    public void setStandardRequest(StandardRequest standardRequest) {
        this.standardRequest = standardRequest;
    }
}

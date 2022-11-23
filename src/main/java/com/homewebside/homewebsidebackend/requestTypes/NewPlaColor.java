package com.homewebside.homewebsidebackend.requestTypes;

public class NewPlaColor {
    private String colorName;
    private StandardRequest standardRequest;

    public NewPlaColor(String colorName, StandardRequest standardRequest) {
        this.colorName = colorName;
        this.standardRequest = standardRequest;
    }

    public NewPlaColor() {
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public StandardRequest getStandardRequest() {
        return standardRequest;
    }

    public void setStandardRequest(StandardRequest standardRequest) {
        this.standardRequest = standardRequest;
    }
}

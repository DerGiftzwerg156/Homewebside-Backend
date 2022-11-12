package com.homewebside.homewebsidebackend.requestTypes;

public class NewAssignmentRequest {
    private String title;
    private String description;

    private String color;
    private String token;

    public NewAssignmentRequest(String title, String description,String color, String token) {
        this.title = title;
        this.description = description;
        this.color = color;
        this.token = token;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

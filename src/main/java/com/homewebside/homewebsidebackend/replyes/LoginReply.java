package com.homewebside.homewebsidebackend.replyes;

import com.homewebside.homewebsidebackend.entity.User;

public class LoginReply {

    private String firstName;

    private String token;
    private String role;
    private String message;
    private boolean status;

    public LoginReply(String firstName, String token, String role, String message, boolean status) {
        this.firstName = firstName;
        this.token = token;
        this.role = role;
        this.message = message;
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

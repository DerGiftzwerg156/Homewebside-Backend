package com.homewebside.homewebsidebackend.requestTypes;

public class StandardRequest {
    private String token;

    public StandardRequest(String token) {
        this.token = token;
    }

    public StandardRequest() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

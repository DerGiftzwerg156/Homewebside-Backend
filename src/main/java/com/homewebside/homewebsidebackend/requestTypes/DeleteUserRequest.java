package com.homewebside.homewebsidebackend.requestTypes;

public class DeleteUserRequest {
    private
    String token;

    public DeleteUserRequest(String token) {
        this.token = token;
    }

    public DeleteUserRequest() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

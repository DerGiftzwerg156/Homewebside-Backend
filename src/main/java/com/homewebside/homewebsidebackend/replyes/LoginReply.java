package com.homewebside.homewebsidebackend.replyes;

import com.homewebside.homewebsidebackend.entity.User;

public class LoginReply {

    private User user;
    private String message;
    private boolean status;

    public LoginReply(User user, String message, boolean status) {
        this.user = user;
        this.message = message;
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

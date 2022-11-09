package com.homewebside.homewebsidebackend.replyes;

import com.homewebside.homewebsidebackend.entity.User;

public class LoginReply {

    private User user;
    private String message;
    private boolean loginStatus;

    public LoginReply(User user, String message, boolean loginStatus) {
        this.user = user;
        this.message = message;
        this.loginStatus = loginStatus;
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

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }
}

package com.homewebside.homewebsidebackend.requestTypes;

public class ChangePasswordRequst {
    private String token;
    private String oldPassword;
    private String newPassword;

    public ChangePasswordRequst(String token, String oldPassword, String newPassword) {
        this.token = token;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}

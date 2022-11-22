package com.homewebside.homewebsidebackend.entity;

public class ActivationCodeRequest {
    private String mail;
    private String name;
    private String verificationCode;

    public ActivationCodeRequest(String mail, String name, String verificationCode) {
        this.mail = mail;
        this.name = name;
        this.verificationCode = verificationCode;
    }

    public ActivationCodeRequest() {
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}

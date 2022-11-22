package com.homewebside.homewebsidebackend.requestTypes;

public class ActivateAccountRequest {
    private String verificationCode;

    public ActivateAccountRequest(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public ActivateAccountRequest() {
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}

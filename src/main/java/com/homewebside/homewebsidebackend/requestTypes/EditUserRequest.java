package com.homewebside.homewebsidebackend.requestTypes;

public class EditUserRequest {

    private String token;
    private String firstName;
    private String lastName;
    private String mail;

    public EditUserRequest(String token, String firstName, String lastName, String mail) {
        this.token = token;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}

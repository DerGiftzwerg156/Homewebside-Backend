package com.homewebside.homewebsidebackend.replyes;

public class UserDataReply {
    private String firstName;
    private String lastName;
    private String mail;
    private String role;

    private int plz;
    private String ort;
    private String street;
    private String houseNumber;
    private String addressBonus;

    private String message;
    private boolean status;

    public UserDataReply(String firstName, String lastName, String mail, String role, int plz, String ort, String street, String houseNumber, String addressBonus, String message, boolean status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.role = role;
        this.plz = plz;
        this.ort = ort;
        this.street = street;
        this.houseNumber = houseNumber;
        this.addressBonus = addressBonus;
        this.message = message;
        this.status = status;
    }

    public UserDataReply(String message, boolean status) {
        this.message = message;
        this.status = status;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAddressBonus() {
        return addressBonus;
    }

    public void setAddressBonus(String addressBonus) {
        this.addressBonus = addressBonus;
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

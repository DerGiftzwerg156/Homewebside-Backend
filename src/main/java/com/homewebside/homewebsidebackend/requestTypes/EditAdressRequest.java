package com.homewebside.homewebsidebackend.requestTypes;

public class EditAdressRequest {
    private String token;
    private int plz;
    private String ort;
    private String street;
    private String houseNumber;
    private String addressBonus;

    public EditAdressRequest(String token, int plz, String ort, String street, String houseNumber, String addressBonus) {
        this.token = token;
        this.plz = plz;
        this.ort = ort;
        this.street = street;
        this.houseNumber = houseNumber;
        this.addressBonus = addressBonus;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
}

package com.homewebside.homewebsidebackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id", nullable = false)
    private int addressId;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;
    @Column(name = "plz", nullable = false)
    private int plz;
    @Column(name = "ort",nullable = false)
    private String ort;
    @Column(name = "street", nullable = false)
    private String street;
    @Column(name = "house_number", nullable = false)
    private String houseNumber;
    @Column(name = "address_bonus", nullable = false)
    private String addressBonus;

    public Address(User userId, int plz, String ort, String street, String houseNumber, String addressBonus) {
        this.userId = userId;
        this.plz = plz;
        this.ort = ort;
        this.street = street;
        this.houseNumber = houseNumber;
        this.addressBonus = addressBonus;
    }

    public Address(){}

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userID) {
        this.userId = userID;
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

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", userID=" + userId +
                ", plz=" + plz +
                ", ort='" + ort + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", addressBonus='" + addressBonus + '\'' +
                '}';
    }
}

package com.homewebside.homewebsidebackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "delivery_options")
public class DeliveryOption {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "delivery_options_id")
    private int deliveryId;

    @Column(name = "delivery_name")
    private String deliveryName;

    @Column(name = "delivery_description")
    private String deliveryDescription;

    @Column(name = "delivery_price")
    private double deliveryPrice;

    public DeliveryOption(String deliveryName, String deliveryDescription, double deliveryPrice) {
        this.deliveryName = deliveryName;
        this.deliveryDescription = deliveryDescription;
        this.deliveryPrice = deliveryPrice;
    }

    public DeliveryOption() {
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryDescription() {
        return deliveryDescription;
    }

    public void setDeliveryDescription(String deliveryDescription) {
        this.deliveryDescription = deliveryDescription;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
}

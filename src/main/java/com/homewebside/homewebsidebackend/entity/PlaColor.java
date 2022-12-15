package com.homewebside.homewebsidebackend.entity;

import javax.persistence.*;

@Entity
@Table(name = "pla_colors")
public class PlaColor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pla_color_id")
    private int plaColorId;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "is_available",nullable = false)
    private boolean availability;

    public PlaColor(String color, boolean availability) {
        this.color = color;
        this.availability = availability;
    }

    public PlaColor() {
    }

    public int getPlaColorId() {
        return plaColorId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "PlaColor{" +
                "plaColorId=" + plaColorId +
                ", color='" + color + '\'' +
                ", isAvailable=" + availability +
                '}';
    }
}

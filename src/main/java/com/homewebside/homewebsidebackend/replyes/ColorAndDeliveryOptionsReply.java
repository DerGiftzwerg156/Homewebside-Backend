package com.homewebside.homewebsidebackend.replyes;

import com.homewebside.homewebsidebackend.entity.DeliveryOption;
import com.homewebside.homewebsidebackend.entity.PlaColor;

public class ColorAndDeliveryOptionsReply {

    PlaColor[] plaColors;
    DeliveryOption[] deliveryOptions;
    Reply reply;

    public ColorAndDeliveryOptionsReply(PlaColor[] plaColors, DeliveryOption[] deliveryOptions, Reply reply) {
        this.plaColors = plaColors;
        this.deliveryOptions = deliveryOptions;
        this.reply = reply;
    }

    public DeliveryOption[] getDeliveryOptions() {
        return deliveryOptions;
    }

    public void setDeliveryOptions(DeliveryOption[] deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
    }

    public PlaColor[] getPlaColors() {
        return plaColors;
    }

    public void setPlaColors(PlaColor[] plaColors) {
        this.plaColors = plaColors;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }
}

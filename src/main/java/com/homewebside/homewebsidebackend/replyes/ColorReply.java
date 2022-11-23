package com.homewebside.homewebsidebackend.replyes;

import com.homewebside.homewebsidebackend.entity.PlaColor;

public class ColorReply {
    private PlaColor[] plaColors;
    private Reply reply;

    public ColorReply(PlaColor[] plaColors, Reply reply) {
        this.plaColors = plaColors;
        this.reply = reply;
    }

    public ColorReply() {
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

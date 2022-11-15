package com.homewebside.homewebsidebackend.replyes;

import com.homewebside.homewebsidebackend.entity.PlaColor;

public class PlaColorReply {

    PlaColor[] plaColors;
    Reply reply;

    public PlaColorReply(PlaColor[] plaColors, Reply reply) {
        this.plaColors = plaColors;
        this.reply = reply;
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

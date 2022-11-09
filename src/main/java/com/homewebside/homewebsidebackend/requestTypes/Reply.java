package com.homewebside.homewebsidebackend.requestTypes;

import java.lang.reflect.Array;

public class Reply {
    public String message;
    public boolean status;

    public Reply(String message, boolean status) {
        this.message = message;
        this.status = status;
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

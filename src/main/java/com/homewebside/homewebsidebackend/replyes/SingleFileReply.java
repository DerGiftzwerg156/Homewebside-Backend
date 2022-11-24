package com.homewebside.homewebsidebackend.replyes;

import java.io.File;

public class SingleFileReply {
    private File file;
    private Reply reply;

    public SingleFileReply(File file, Reply reply) {
        this.file = file;
        this.reply = reply;
    }

    public SingleFileReply() {
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }
}

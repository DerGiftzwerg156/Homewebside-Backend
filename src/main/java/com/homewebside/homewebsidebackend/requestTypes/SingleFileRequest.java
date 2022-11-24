package com.homewebside.homewebsidebackend.requestTypes;

public class SingleFileRequest {
    private String fileName;

    public SingleFileRequest(String fileName) {
        this.fileName = fileName;
    }

    public SingleFileRequest() {
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}

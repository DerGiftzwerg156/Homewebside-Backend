package com.homewebside.homewebsidebackend.requestTypes;

public class NewNewsRequest {
    private String newsTitle;
    private String newsText;
    private String token;

    public NewNewsRequest(String newsTitle, String newsText, String token) {
        this.newsTitle = newsTitle;
        this.newsText = newsText;
        this.token = token;
    }

    public NewNewsRequest() {
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

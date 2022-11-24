package com.homewebside.homewebsidebackend.replyes;

import com.homewebside.homewebsidebackend.entity.News;

public class NewsReply {
    private News[] news;
    private Reply reply;

    public NewsReply(News[] news, Reply reply) {
        this.news = news;
        this.reply = reply;
    }

    public News[] getNews() {
        return news;
    }

    public void setNews(News[] news) {
        this.news = news;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }
}

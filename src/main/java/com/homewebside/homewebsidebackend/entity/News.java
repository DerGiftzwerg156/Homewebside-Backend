package com.homewebside.homewebsidebackend.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "news_id")
    private int newsId;

    @Column(name = "news_title")
    private String newsTitle;

    @Column(name = "news_text")
    private String newsText;

    @Column(name = "release_date")
    private Timestamp releaseDate;

    public News(String newsTitle, String newsText, Timestamp releaseDate) {
        this.newsTitle = newsTitle;
        this.newsText = newsText;
        this.releaseDate = releaseDate;
    }

    public News() {
    }

    public int getNewsId() {
        return newsId;
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

    public Timestamp getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Timestamp releaseDate) {
        this.releaseDate = releaseDate;
    }
}

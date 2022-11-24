package com.homewebside.homewebsidebackend.entity;

import javax.persistence.*;
import java.util.Date;

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
    private Date releaseDate;

    @Column(name = "picture")
    private String pictureName;

    public News(String newsTitle, String newsText, Date releaseDate, String pictureName) {
        this.newsTitle = newsTitle;
        this.newsText = newsText;
        this.releaseDate = releaseDate;
        this.pictureName = pictureName;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}

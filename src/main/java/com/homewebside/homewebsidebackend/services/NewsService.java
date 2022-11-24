package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.News;
import com.homewebside.homewebsidebackend.interfaces.NewsRepository;
import com.homewebside.homewebsidebackend.replyes.NewsReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.requestTypes.NewNewsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthService authService;


    public Reply createNewNews(NewNewsRequest newNewsRequest) {
        if (tokenService.isTokenValid(newNewsRequest.getToken())) {
            if (authService.checkIfAdmin(newNewsRequest.getToken())) {
                Date date = new Date();
                News news = new News(newNewsRequest.getNewsTitle(), newNewsRequest.getNewsText(), date, "Placeholder");
                newsRepository.save(news);
                return new Reply("Success", true);
            } else {
                return new Reply("No Permissions", false);
            }
        } else {
            return new Reply("Token invalid", false);
        }
    }

    public NewsReply getAllNews() {
        List<News> newsList = newsRepository.findAll();
        News[] news = newsList.toArray(new News[0]);
        return new NewsReply(news, new Reply("Success", true));
    }

    public NewsReply getLastNews() {
        List<News> newsList = newsRepository.findAll();
        News[] news = new News[1];
        for (int i = 0; i < 1; i++) {
            news[i] = newsList.get(i);
        }
        return new NewsReply(news, new Reply("Success", true));
    }
}

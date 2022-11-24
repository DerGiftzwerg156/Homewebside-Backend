package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.replyes.NewsReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.requestTypes.NewNewsRequest;
import com.homewebside.homewebsidebackend.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/news")
@CrossOrigin
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/getLastFive")
    private NewsReply getLastFiveNews() {
        return newsService.getLastFiveNews();
    }

    @GetMapping("/getAllNews")
    private NewsReply getAllNews() {
        return newsService.getAllNews();
    }

    @PostMapping("/newNews")
    private Reply createNewNews(@RequestBody NewNewsRequest newNewsRequest) {
        return newsService.createNewNews(newNewsRequest);
    }
}

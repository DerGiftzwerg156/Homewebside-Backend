package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.replyes.SingleFileReply;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class FileService {

    public void getNewsPicture(String filename) {
        File file = new File("C:\\TestFiles\firstNews_picture.jpeg");
        System.out.println(file.getName());
    }

    public SingleFileReply getSinglePicture(String fileName) {
        File file = new File("C:\\TestFiles\firstNews_picture.jpeg");
        return new SingleFileReply(file, new Reply("Success", true));
    }
}

package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.replyes.Reply;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileWriter;

@RestController
@RequestMapping("/api/files")
public class FileController {

    @PostMapping("/upload")
    public Reply uploadFile(@RequestParam("file") MultipartFile file) throws Exception {
        File newFile = new File(file.getOriginalFilename() + ".txt");
        if (newFile.createNewFile()) {
            FileWriter fileWriter = new FileWriter(newFile.getName());
            fileWriter.write(file.getOriginalFilename());
            fileWriter.close();
        } else {
        }
        return new Reply("Test", false);
    }


}

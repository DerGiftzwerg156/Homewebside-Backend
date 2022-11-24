package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.replyes.SingleFileReply;
import com.homewebside.homewebsidebackend.requestTypes.SingleFileRequest;
import com.homewebside.homewebsidebackend.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileWriter;

@RestController
@RequestMapping("/api/files")
public class FileController {

    @Autowired
    private FileService fileService;

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

    @PostMapping("/getFileByFileName")
    public SingleFileReply getFileByFilename(@RequestBody SingleFileRequest singleFileRequest){
        return fileService.getSinglePicture(singleFileRequest.getFileName());
    }


}

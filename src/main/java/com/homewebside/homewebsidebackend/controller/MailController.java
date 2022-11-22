package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.entity.MailDetails;
import com.homewebside.homewebsidebackend.interfaces.MailService;
import com.homewebside.homewebsidebackend.replyes.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mail")
@CrossOrigin
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/sendMail")
    public Reply sendMail(@RequestBody MailDetails details){
        mailService.sendSimpleMail(details);
        return new Reply("Sended?",true);
    }
}

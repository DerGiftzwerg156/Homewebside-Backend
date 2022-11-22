package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.MailDetails;
import com.homewebside.homewebsidebackend.interfaces.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}") private String sender;

    public String sendSimpleMail(MailDetails details){
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getRecipient());
            mailMessage.setText(details.getMessageBody());
            mailMessage.setSubject(details.getSubject());

            mailSender.send(mailMessage);
            return "Mail Sent Successfully";
        }catch (Exception e){
            return "Error while Sending Mail";
        }
    }
}

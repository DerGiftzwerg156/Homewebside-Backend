package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.MailDetails;
import com.homewebside.homewebsidebackend.interfaces.MailService;
import com.homewebside.homewebsidebackend.replyes.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;


@Service
public class EmailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String sender;

    public String sendSimpleMail(MailDetails details) {
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getRecipient());
            mailMessage.setText(details.getMessageBody());
            mailMessage.setSubject(details.getSubject());

            mailSender.send(mailMessage);
            return "Mail Sent Successfully";
        } catch (Exception e) {
            return "Error while Sending Mail";
        }
    }

    public boolean sendVerificationMail(String mail, String name, String verificationCode) {
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(sender);
            mailMessage.setTo(mail);
            mailMessage.setText("Hallo " + name + ","
                    + "\n\nHier ist dein Verifizierungscode: " + verificationCode
                    + "\n\nBitte öffne diesen Link und gebe dort deinen Code ein:"
                    + "\n\nhttp://kenosserver.de/activateAccount"
                    + "\n\nNice Grüße"
                    + "\n"
                    + "\nDein 3D Druck Store Team");
            mailMessage.setSubject("Account Aktivieren");

            mailSender.send(mailMessage);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String sendMailWithAttachment(MailDetails details) {
        // Creating a mime message
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper;

        try {

            // Setting multipart as true for attachments to
            // be send
            mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(details.getRecipient());
            mimeMessageHelper.setText(details.getMessageBody());
            mimeMessageHelper.setSubject(details.getSubject());

            // Adding the attachment
            FileSystemResource file = new FileSystemResource(new File(details.getAttachment()));

            mimeMessageHelper.addAttachment(file.getFilename(), file);

            // Sending the mail
            mailSender.send(mimeMessage);
            return "Mail sent Successfully";
        }

        // Catch block to handle MessagingException
        catch (MessagingException e) {

            // Display message when exception occurred
            return "Error while sending mail!!!";
        }
    }
}
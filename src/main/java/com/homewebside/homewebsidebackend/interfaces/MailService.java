package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.MailDetails;
import com.homewebside.homewebsidebackend.replyes.Reply;

public interface MailService {

    String sendSimpleMail(MailDetails details);

    String sendMailWithAttachment(MailDetails details);

    boolean sendVerificationMail(String mail, String name, String verificationMail);
}

package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.MailDetails;

public interface MailService {

    String sendSimpleMail(MailDetails details);
}

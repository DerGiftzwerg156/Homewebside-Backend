package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.Token;
import com.homewebside.homewebsidebackend.entity.User;
import com.homewebside.homewebsidebackend.interfaces.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    public boolean isTokenValid(String tokenValue){
        Token token = tokenRepository.findByToken(tokenValue);

//        new Timestamp(System.currentTimeMillis())- token.getTimestamp()
        return true;
    }
}

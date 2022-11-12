package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.Token;
import com.homewebside.homewebsidebackend.interfaces.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    public boolean isTokenValid(String tokenValue) {
        if (tokenRepository.findByToken(tokenValue) != null) {
            Token token = tokenRepository.findByToken(tokenValue);
            long actualTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
            if ((token.getTimestamp().getTime() + 3600000) > actualTimestamp) {
                return true;
            } else {
                tokenRepository.deleteById(token.getTokenid());
                return false;
            }
        }
        return false;
    }
}

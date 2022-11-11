package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.Token;
import com.homewebside.homewebsidebackend.entity.User;
import com.homewebside.homewebsidebackend.interfaces.TokenRepository;
import com.homewebside.homewebsidebackend.interfaces.UserRepository;
import com.homewebside.homewebsidebackend.replyes.LoginReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.requestTypes.LoginDataRequest;
import com.homewebside.homewebsidebackend.requestTypes.RegisterDataRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.Base64;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenRepository tokenRepository;

    private static final SecureRandom secureRandom = new SecureRandom();
    private static final Base64.Encoder base64encoder = Base64.getUrlEncoder();

    public Reply register(RegisterDataRequest registerDataRequest) {
        if (checkUserExist(registerDataRequest.getMail())) {
            return new Reply("Email already registered", false);
        }
        userRepository.save(new User(registerDataRequest.getFirstName(), registerDataRequest.getLastName(), registerDataRequest.getMail(), registerDataRequest.getPassword().hashCode(), "user"));
        return new Reply("Successfully created User", true);
    }

    public LoginReply login(LoginDataRequest loginDataRequest) {
        if (userRepository.findByMail(loginDataRequest.getMail()) != null) {
            User existingUser = userRepository.findByMail(loginDataRequest.getMail());
            if (existingUser.getPassword() == loginDataRequest.getPassword().hashCode()) {
                Token token = new Token(existingUser, generateToken(), new Timestamp(System.currentTimeMillis()));
                Token oldToken =  tokenRepository.findByUserid(existingUser);
                tokenRepository.deleteById(oldToken.getTokenid());
                tokenRepository.save(token);
                return new LoginReply(existingUser.getFirstName(), token.getToken(), existingUser.getRole(), "Successfully logged in", true);
            }
        }
        return new LoginReply("", "", "", "Wrong Login Data", false);
    }

    private String generateToken() {
        byte[] token = new byte[24];
        secureRandom.nextBytes(token);
        return base64encoder.encodeToString(token);
    }

    private boolean checkUserExist(String mail) {
        return userRepository.findByMail(mail) != null;
    }
}

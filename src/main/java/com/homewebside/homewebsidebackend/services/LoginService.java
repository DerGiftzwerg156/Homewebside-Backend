package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.User;
import com.homewebside.homewebsidebackend.interfaces.UserRepository;
import com.homewebside.homewebsidebackend.requestTypes.LoginDataRequest;
import com.homewebside.homewebsidebackend.replyes.LoginReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public LoginReply login(LoginDataRequest loginDataRequest){
        int hashedPassword = loginDataRequest.getPassword().hashCode();
        User user = userRepository.findByMail(loginDataRequest.getMail());
        if(user != null){
            if(hashedPassword == user.getPassword()){
                return new LoginReply(user, "Login Successful", true);
            }
            else {
                return new LoginReply(new User(), "Wrong Login Data", false);
            }
        }else {
            return new LoginReply(new User(), "User not found", false);
        }
    }
}

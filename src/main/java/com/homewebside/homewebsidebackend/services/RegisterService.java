package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.User;
import com.homewebside.homewebsidebackend.interfaces.UserRepository;
import com.homewebside.homewebsidebackend.requestTypes.RegisterDataRequest;
import com.homewebside.homewebsidebackend.replyes.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    private UserRepository userRepository;


    public Reply register(RegisterDataRequest registerDataRequest){
        int hashedPassword = registerDataRequest.getPassword().hashCode();
        User user = new User(registerDataRequest.getFirstName(),registerDataRequest.getLastName(),registerDataRequest.getMail(),hashedPassword,"User");
        userRepository.save(user);
        if(userRepository.findByMail(user.getMail()) != null) {
            return new Reply("User successful created!", true);
        }else {
            return new Reply("User can't be created, please try again!", false);
        }
    }
}

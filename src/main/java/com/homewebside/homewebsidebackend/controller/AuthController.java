package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.replyes.LoginReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.requestTypes.LoginDataRequest;
import com.homewebside.homewebsidebackend.requestTypes.RegisterDataRequest;
import com.homewebside.homewebsidebackend.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins="http://localhost:4200")
public class AuthController {
    
    @Autowired
    private AuthService authService;
    
    @PostMapping("/register")
    public Reply Register(@RequestBody RegisterDataRequest registerDataRequest){
        return authService.register(registerDataRequest);
    }
    
    @PostMapping("/login")
    public LoginReply login(@RequestBody LoginDataRequest loginDataRequest){
        return authService.login(loginDataRequest);
    }
}

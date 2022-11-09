package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.requestTypes.LoginDataRequest;
import com.homewebside.homewebsidebackend.requestTypes.LoginReply;
import com.homewebside.homewebsidebackend.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping
    public LoginReply LoginUser(@RequestBody LoginDataRequest loginDataRequest) {
        return loginService.login(loginDataRequest);
    }
}

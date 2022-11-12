package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.replyes.LoginReply;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.requestTypes.LoginDataRequest;
import com.homewebside.homewebsidebackend.requestTypes.RegisterDataRequest;
import com.homewebside.homewebsidebackend.services.AuthService;
import com.homewebside.homewebsidebackend.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/register")
    public Reply Register(@RequestBody RegisterDataRequest registerDataRequest) {
        return authService.register(registerDataRequest);
    }

    @PostMapping("/login")
    public LoginReply login(@RequestBody LoginDataRequest loginDataRequest) {
        return authService.login(loginDataRequest);
    }

    @PostMapping("/validateToken")
    public Reply validateToken(@RequestBody String token) {

        if (tokenService.isTokenValid(token)) {
            return new Reply("Token is Valid", true);
        } else {
            return new Reply("Token invalid", false);
        }
    }
}

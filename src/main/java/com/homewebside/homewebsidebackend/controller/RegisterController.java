package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.requestTypes.RegisterDataRequest;
import com.homewebside.homewebsidebackend.requestTypes.Reply;
import com.homewebside.homewebsidebackend.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping
    private Reply register(@RequestBody RegisterDataRequest registerDataRequest){
        return registerService.register(registerDataRequest);
    }
}

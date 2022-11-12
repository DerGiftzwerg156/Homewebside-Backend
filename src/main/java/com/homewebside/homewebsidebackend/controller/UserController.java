package com.homewebside.homewebsidebackend.controller;

import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.replyes.UserDataReply;
import com.homewebside.homewebsidebackend.requestTypes.*;
import com.homewebside.homewebsidebackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/deleteUser")
    private Reply deleteUser(@RequestBody DeleteUserRequest deleteUserRequest){
        return userService.deleteUser(deleteUserRequest);
    }

    @PostMapping("/editUser")
    private Reply editUser(@RequestBody EditUserRequest editUserRequest){
        return userService.editUser(editUserRequest);
    }

    @PostMapping("/changePassword")
    private Reply changePassword(@RequestBody ChangePasswordRequst changePasswordRequst){
        return userService.changePassword(changePasswordRequst);
    }

    @PostMapping("/editAddress")
    private Reply editAddress(@RequestBody EditAdressRequest editAdressRequest){
        return userService.editAddress(editAdressRequest);
    }

    @PostMapping("/getUser")
    private UserDataReply getUser(@RequestBody StandardRequest standardRequest){
        return userService.getUserData(standardRequest);
    }
}

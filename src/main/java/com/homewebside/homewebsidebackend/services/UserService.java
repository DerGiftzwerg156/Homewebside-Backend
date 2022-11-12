package com.homewebside.homewebsidebackend.services;

import com.homewebside.homewebsidebackend.entity.User;
import com.homewebside.homewebsidebackend.interfaces.AddressRepository;
import com.homewebside.homewebsidebackend.interfaces.TokenRepository;
import com.homewebside.homewebsidebackend.interfaces.UserRepository;
import com.homewebside.homewebsidebackend.replyes.Reply;
import com.homewebside.homewebsidebackend.entity.Address;
import com.homewebside.homewebsidebackend.replyes.UserDataReply;
import com.homewebside.homewebsidebackend.requestTypes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private TokenRepository tokenRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private TokenService tokenService;

    public Reply deleteUser(DeleteUserRequest deleteUserRequest) {
        if (tokenService.isTokenValid(deleteUserRequest.getToken())) {
            if (tokenRepository.findByToken(deleteUserRequest.getToken()) != null) {
                User user = tokenRepository.findByToken(deleteUserRequest.getToken()).getUserid();
                userRepository.deleteById(user.getId());

                return new Reply("User successfully deleted", true);
            } else {
                return new Reply("Failure", false);
            }
        } else return new Reply("Token is Invalid, please login again!", false);
    }

    public Reply editUser(EditUserRequest editUserRequest) {
        if (tokenService.isTokenValid(editUserRequest.getToken())) {
            if (tokenRepository.findByToken(editUserRequest.getToken()) != null) {
                User user = tokenRepository.findByToken(editUserRequest.getToken()).getUserid();
                user.setFirstName(editUserRequest.getFirstName());
                user.setLastName(editUserRequest.getLastName());
                user.setMail(editUserRequest.getMail());
                userRepository.save(user);
                return new Reply("Successfully updated User", true);
            } else {
                return new Reply("Failure, User not found", false);
            }
        } else return new Reply("Token is Invalid, please login again!", false);
    }

    public Reply changePassword(ChangePasswordRequst changePasswordRequst) {
        if (tokenService.isTokenValid(changePasswordRequst.getToken())) {
            if (tokenRepository.findByToken(changePasswordRequst.getToken()) != null) {
                User user = tokenRepository.findByToken(changePasswordRequst.getToken()).getUserid();
                if (user.getPassword() == changePasswordRequst.getOldPassword().hashCode()) {
                    user.setPassword(changePasswordRequst.getNewPassword().hashCode());
                    userRepository.save(user);
                    return new Reply("Successfully changed Password", true);
                } else return new Reply("Wrong old Password", false);
            } else return new Reply("Failure, User not found", false);
        } else return new Reply("Token is Invalid, please login again!", false);
    }

    public Reply editAddress(EditAdressRequest editAdressRequest) {
        if (tokenService.isTokenValid(editAdressRequest.getToken())) {
            if (tokenRepository.findByToken(editAdressRequest.getToken()) != null) {
                User user = tokenRepository.findByToken(editAdressRequest.getToken()).getUserid();
                if (addressRepository.findByUserId(user) != null) {
                    Address address = addressRepository.findByUserId(user);
                    address.setPlz(editAdressRequest.getPlz());
                    address.setOrt(editAdressRequest.getOrt());
                    address.setStreet(editAdressRequest.getStreet());
                    address.setHouseNumber(editAdressRequest.getHouseNumber());
                    address.setAddressBonus(editAdressRequest.getAddressBonus());
                    addressRepository.save(address);
                    return new Reply("Successfully updated Adress", true);
                } else {
                    Address address = new Address(user, editAdressRequest.getPlz(), editAdressRequest.getOrt(), editAdressRequest.getStreet(), editAdressRequest.getHouseNumber(), editAdressRequest.getAddressBonus());
                    addressRepository.save(address);
                    return new Reply("Successfully updated Adress", true);
                }
            } else {
                return new Reply("Failure, User not found", false);
            }
        } else return new Reply("Token is Invalid, please login again!", false);
    }

    public UserDataReply getUserData(StandardRequest standardRequest) {
        if (tokenService.isTokenValid(standardRequest.getToken())) {
            if (tokenRepository.findByToken(standardRequest.getToken()) != null) {
                User user = tokenRepository.findByToken(standardRequest.getToken()).getUserid();
                if (addressRepository.findByUserId(user) != null) {
                    Address address = addressRepository.findByUserId(user);
                    return new UserDataReply(user.getFirstName(), user.getLastName(), user.getMail(), user.getRole(), address.getPlz(), address.getOrt(), address.getStreet(), address.getHouseNumber(), address.getAddressBonus(), "Successfully found User", true);
                } else {
                    return new UserDataReply(user.getFirstName(), user.getLastName(), user.getMail(), user.getRole(), 0, "", "", "", "", "Successfully found User", true);
                }
            } else return new UserDataReply("Failure", false);
        } else return new UserDataReply("Token ist Invalid, please login again!", false);
    }
}

package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByMail(String mail);

    User findByVerificationCode(String verificationCode);

    List<User> findAllByRole(String role);
}

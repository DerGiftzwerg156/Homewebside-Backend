package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByMail(String mail);

    User findByVerificationCode(String verificationCode);
}

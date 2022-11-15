package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.Token;
import com.homewebside.homewebsidebackend.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TokenRepository extends CrudRepository<Token, Integer> {
    Token findByToken(String tokenValue);

    List<Token> findAllByUserid(User user);

    Token findByUserid(User user);

    void deleteByUserid(User user);
}

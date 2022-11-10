package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.Token;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends CrudRepository<Token,Integer> {
}

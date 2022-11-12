package com.homewebside.homewebsidebackend.interfaces;


import com.homewebside.homewebsidebackend.entity.Address;
import com.homewebside.homewebsidebackend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {
    Address findByUserId(User user);

    void deleteByUserId(User user);
}

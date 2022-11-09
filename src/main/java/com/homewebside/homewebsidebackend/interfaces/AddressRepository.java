package com.homewebside.homewebsidebackend.interfaces;


import com.homewebside.homewebsidebackend.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {
}

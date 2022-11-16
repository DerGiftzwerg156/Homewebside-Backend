package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.DeliveryOption;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryOptionsRepository extends CrudRepository<DeliveryOption, Integer> {

    DeliveryOption findByDeliveryName(String deliveryName);

    List<DeliveryOption> findAll();
}

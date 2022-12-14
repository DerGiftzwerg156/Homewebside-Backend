package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.PaymentStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentStatusCodeRepository extends CrudRepository<PaymentStatus, Integer> {

    List<PaymentStatus> findAll();

    PaymentStatus findByPaymentStatusCode(int paymentStatusCode);
}

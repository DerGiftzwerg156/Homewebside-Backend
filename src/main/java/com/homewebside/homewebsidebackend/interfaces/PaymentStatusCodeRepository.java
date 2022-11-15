package com.homewebside.homewebsidebackend.interfaces;

import com.homewebside.homewebsidebackend.entity.PaymentStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentStatusCodeRepository extends CrudRepository<PaymentStatus, Integer> {

    PaymentStatus findByPaymentStatusCode(int paymentStatusCode);
}

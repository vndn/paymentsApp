package com.vandan.paymentsApp.repository;

import com.vandan.paymentsApp.models.request.PaymentRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<PaymentRequest, String> {
    //public Customer findByFirstName(String firstName);
    //public List<Customer> findByLastName(String lastName);
}
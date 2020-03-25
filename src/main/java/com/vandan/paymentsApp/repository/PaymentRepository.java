package com.vandan.paymentsApp.repository;

import java.util.List;

import com.vandan.paymentsApp.models.PaymentRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<PaymentRequest, String> {
    //public Customer findByFirstName(String firstName);
    //public List<Customer> findByLastName(String lastName);
}
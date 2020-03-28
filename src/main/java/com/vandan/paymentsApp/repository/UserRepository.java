package com.vandan.paymentsApp.repository;

import com.vandan.paymentsApp.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByName(String name);
    public User findByPhoneNumber(String number);
}

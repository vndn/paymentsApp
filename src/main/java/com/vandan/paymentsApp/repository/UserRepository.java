package com.vandan.paymentsApp.repository;

import java.util.List;

import com.vandan.paymentsApp.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByName(String name);
}

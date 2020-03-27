package com.vandan.paymentsApp.services;

import com.vandan.paymentsApp.models.NewUser;
import com.vandan.paymentsApp.models.User;
import com.vandan.paymentsApp.repository.CustomerRepository;
import com.vandan.paymentsApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService{

    @Autowired
    private UserRepository userDB;

    @Autowired
    private CustomerRepository repository;

    public ResponseEntity<User> createNewUser(NewUser newUser){
        Optional<User> userCheck = Optional.ofNullable(userDB.findByName(newUser.getName()));
        if(userCheck.isPresent()){
            User user = new User(newUser.getPhoneNumber(), newUser.getName(), "123");
            return new ResponseEntity<User>(user, HttpStatus.LOCKED);
        }
        else{
            User user = new User(newUser.getPhoneNumber(), newUser.getName(), "123");
            userDB.save(user);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }
    }
}
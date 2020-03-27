package com.vandan.paymentsApp.controllers;

import com.vandan.paymentsApp.models.NewUser;
import com.vandan.paymentsApp.models.User;
import com.vandan.paymentsApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
public class UserController{
    @Autowired
    private UserService userService;

    /*
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
    */
    @PostMapping(path = "/user/new", consumes = "application/json", produces = "application/json")
    public ResponseEntity<User> paymentRequestHandler (@RequestBody NewUser newUser) throws URISyntaxException {
        return userService.createNewUser(newUser);
        //return new ResponseEntity<TransactionStatus>(transStat, HttpStatus.OK);
    }

}

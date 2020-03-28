package com.vandan.paymentsApp.controllers;

import com.vandan.paymentsApp.models.request.PaymentRequest;
import com.vandan.paymentsApp.models.response.TransactionStatus;
import com.vandan.paymentsApp.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
public class Payment{
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @PostMapping(path = "/pay", consumes = "application/json", produces = "application/json")
    public ResponseEntity<TransactionStatus> paymentRequestHandler (@RequestBody PaymentRequest paymentRequest) throws URISyntaxException {
        TransactionStatus transStat = new TransactionStatus(5, 115.5, "SUCCESS");
        return paymentService.payToPerson(paymentRequest);
        //return new ResponseEntity<TransactionStatus>(transStat, HttpStatus.OK);

    }

}

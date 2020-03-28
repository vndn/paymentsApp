package com.vandan.paymentsApp.repository;

import com.vandan.paymentsApp.entity.Wallet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WalletRepository extends MongoRepository<Wallet, String> {

    public Wallet findByCustID(String name);
    //public User findByPhoneNumber(String number);
}

package com.vandan.paymentsApp.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Wallet {
    @Id
    private String walletID;
    private float balance;
    private float balanceLimit;
    private String custID;
    private float transactionLimit;

    Wallet() {}

    public Wallet( String custID, float balance, float balanceLimit, float transactionLimit) {
        this.walletID = walletID;
        this.balance = balance;
        this.balanceLimit = balanceLimit;
        this.custID = custID;
        this.transactionLimit = transactionLimit;
    }

}


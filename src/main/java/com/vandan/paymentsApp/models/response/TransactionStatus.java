package com.vandan.paymentsApp.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionStatus {
    int transaction_id;
    String status;
    double amount;
    public TransactionStatus(int tid, double amount, String status){
        this.transaction_id = tid;
        this.status = status;
        this.amount = amount;
    }

}

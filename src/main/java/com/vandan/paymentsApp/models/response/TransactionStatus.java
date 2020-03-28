package com.vandan.paymentsApp.models.response;

import lombok.Data;


@Data
public class TransactionStatus {
    int transaction_id;
    double amount;
    String status;
    String byWhom;
    String toWhom;
    public TransactionStatus(int tid, double amount, String status, String byWhom, String toWhom){
        this.transaction_id = tid;
        this.status = status;
        this.amount = amount;
        this.toWhom = toWhom;
        this.byWhom = byWhom;
    }

}

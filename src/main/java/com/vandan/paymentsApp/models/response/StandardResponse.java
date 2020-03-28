package com.vandan.paymentsApp.models.response;

import lombok.Data;

@Data
public class StandardResponse {
    int transaction_id;
    String status;
    double amount;
    String byWhom;
    String toWhom;
    public StandardResponse(int tid, double amount, String status, String byWhom, String toWhom){
        this.transaction_id = tid;
        this.status = status;
        this.amount = amount;
        this.toWhom = toWhom;
        this.byWhom = byWhom;
    }

}

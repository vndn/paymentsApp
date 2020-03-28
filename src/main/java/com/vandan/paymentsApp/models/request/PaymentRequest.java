package com.vandan.paymentsApp.models.request;

import com.vandan.paymentsApp.controllers.Payment;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class PaymentRequest {
    @Id
    public String id;
    public String payto;
    public double amount;

    PaymentRequest() {}

    PaymentRequest(double amount, String payto){
        this.payto = payto;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

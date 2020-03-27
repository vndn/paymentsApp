package com.vandan.paymentsApp.models;

import com.vandan.paymentsApp.controllers.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewUser {
    private String phoneNumber;
    private String name;

    NewUser() {}

    public NewUser(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}


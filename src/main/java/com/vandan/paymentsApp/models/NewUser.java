package com.vandan.paymentsApp.models;

import lombok.Data;

@Data

public class NewUser {
    private String phoneNumber;
    private String name;
    private String promoCode;

    NewUser() {}

    public NewUser(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

}


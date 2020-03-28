package com.vandan.paymentsApp.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class User {
    @Id
    private String id;
    private String phoneNumber;
    private String name;
    private String walletID;

    User() {}

    public User(String phoneNumber, String name, String walletID) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.walletID = walletID;
    }

    public void setWalletID(String walletID) {
        this.walletID = walletID;
    }
    public String toString() {
        return String.format(
                "Customer[id=%s, Name='%s', Phone='%s']",
                id, name, phoneNumber);
    }

}


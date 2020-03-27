package com.vandan.paymentsApp.services;

import com.vandan.paymentsApp.models.db.Wallet;
import com.vandan.paymentsApp.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class WalletService{

    //@Autowired
    private static WalletRepository walletDB;

    public static boolean createWallet(Wallet wallet){

        return true;
    }
}
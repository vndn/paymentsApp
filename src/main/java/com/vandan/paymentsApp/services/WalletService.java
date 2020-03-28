package com.vandan.paymentsApp.services;

import com.vandan.paymentsApp.entity.Wallet;
import com.vandan.paymentsApp.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;

//@Service
public class WalletService{

    @Autowired
    private static WalletRepository walletDB;

    public static boolean createWallet(Wallet wallet){

        return true;
    }
}
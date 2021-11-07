package com.company;
import java.security.cert.TrustAnchor;


public class Kaspi implements WebWallet {
    float amount;

    public Kaspi(float amount){
        this.amount = amount;
    }


    @Override
    public void pay(float cost) {
        boolean flag = ableToPay(cost);
        if (flag) {
            updateWallet(cost);
            System.out.println("Payment has been completed with Kaspi Wallet. Total: " + cost + "kzt");
        }
        else {
            System.out.println("Not enough money to pay " + cost + "kzt");
        }


    }

    public boolean ableToPay(float cost){
        return amount >= cost;
    }

    public void updateWallet(float cost){
       amount -= cost;
    }

    @Override
    public void displayWallet() {
        System.out.println("Current balance: " + amount + "kzt");
    }



}

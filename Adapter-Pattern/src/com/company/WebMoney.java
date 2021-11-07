package com.company;

import java.util.Random;

public class WebMoney {

    float amount;

    public WebMoney(float amount){
        this.amount = amount;
    }

    public void PayWithUsd(float cost){
        if (ableToPay(cost)) {
            updateWallet(cost);
            System.out.println("Payment has been completed with Kaspi Wallet. Total: " + cost + "usd");
        }
        else {
            System.out.println("Not enough money to pay " + cost + "usd");
        }
    }

    public boolean ableToPay(float cost) {
        return amount >= cost;
    }

    public void updateWallet(float cost) {
        amount -= cost;
    }

    public void displayWallet() {
        System.out.println("Current balance: " + amount + "usd");
    }

}

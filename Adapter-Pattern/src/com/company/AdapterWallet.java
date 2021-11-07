package com.company;
import java.util.Random;

public class AdapterWallet implements WebWallet {

    WebMoney webMoney;

    public AdapterWallet(WebMoney newWebMoney){
        webMoney = newWebMoney;
    }

    public float toUsd(float cost){
        return cost/400;
    }

    @Override
    public void pay(float cost) {
        webMoney.PayWithUsd(toUsd(cost));
    }

    @Override
    public void displayWallet() {
        webMoney.displayWallet();
    }

    @Override
    public void updateWallet(float cost) {
        webMoney.updateWallet(toUsd(cost));
    }
}

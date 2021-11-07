package com.company;

public class Main {

    public static void main(String[] args) {
        Kaspi kaspi = new Kaspi(1000);
        kaspi.displayWallet();
        kaspi.pay(100);
        kaspi.displayWallet();
        kaspi.pay(1000);


        AdapterWallet webmoney = new AdapterWallet(new WebMoney(100));
        webmoney.displayWallet();
        webmoney.pay(200);
        webmoney.displayWallet();
        webmoney.pay(900);
        webmoney.displayWallet();
        webmoney.pay(1000);
        webmoney.displayWallet();
        webmoney.pay(2000000);
        webmoney.displayWallet();

    }
}

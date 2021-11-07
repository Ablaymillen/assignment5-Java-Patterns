package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Porsche(new TireLettering());
        porsche.displayCar();

        System.out.println("");

        Car bmw = new BMW(new WindowTinting());
        bmw.displayCar();
    }
}

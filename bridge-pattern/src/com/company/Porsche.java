package com.company;

public class Porsche extends Car{

    public Porsche(UpgradeCar upgradeCar){
        super(upgradeCar);
    }

    @Override
    public void displayCar() {
        System.out.println("Porsche car has been chosen.");
        upgradeCar.Upgrade();
    }
}

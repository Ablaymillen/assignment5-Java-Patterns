package com.company;

public class BMW extends Car{
    public BMW(UpgradeCar upgradeCar){
        super(upgradeCar);
    }

    @Override
    public void displayCar() {
        System.out.println("BMW car has been chosen.");
        upgradeCar.Upgrade();
    }
}

package com.company;

public abstract class Car {
    protected UpgradeCar upgradeCar;

    public Car(UpgradeCar newUpgrade){
        upgradeCar = newUpgrade;
    }

    abstract public void displayCar();
}

package com.company;

public class Schema implements Data {
    @Override
    public void format() {
        System.out.println("Drawing schema...");
    }

    @Override
    public void display() {
        System.out.println("Display data in schemas");
    }
}

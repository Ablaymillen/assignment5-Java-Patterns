package com.company;

public class CSV implements Data {
    @Override
    public void format() {
        System.out.println("Data has been formatted in CSV...");
    }

    @Override
    public void display() {
        System.out.println("Display data separated by commas");
    }
}

package com.company;

public class SQL implements Data {


    @Override
    public void format() {
        System.out.println("Data has been formatted in SQL DBMS...");
    }

    @Override
    public void display() {
        System.out.println("Display data in query selector");
    }
}

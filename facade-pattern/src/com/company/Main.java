package com.company;

public class Main {

    public static void main(String[] args) {
        DataFacade dataFacade = new DataFacade();

        dataFacade.formatCSV();
        dataFacade.displayCSV();

        dataFacade.formatSQL();
        dataFacade.displaySQL();

        dataFacade.formatSchema();
        dataFacade.displaySchema();
    }
}

package com.company;

public class DataFacade {
    protected Data csv;
    protected Data sql;
    protected Data schema;

    public DataFacade(){
        csv = new CSV();
        sql = new SQL();
        schema = new Schema();

    }

    public void formatCSV() {
        csv.format();
    }

    public void formatSQL() {
        sql.format();
    }

    public void formatSchema() {
        schema.format();
    }


    public void displayCSV(){
        csv.display();
    }

    public void displaySQL(){
        sql.display();
    }

    public void displaySchema(){
        schema.display();
    }


}

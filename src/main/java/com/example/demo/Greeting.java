package com.example.demo;

public class Greeting {
    DataHolder dataholder;
    public Greeting(String message) {
        this.dataholder = new DataHolder();
        this.dataholder.addData(message);
    }

}

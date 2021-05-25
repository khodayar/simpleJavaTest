package com.example.demo;

import java.util.ArrayList;

public class DataHolder {

    public DataHolder(){
        this.data = new ArrayList<>();
    }

    ArrayList<String> data;

    public void addData(String str) {
        this.data.add(str);
    }

}

package com.example.demo;

public class DemoApplication {

    public static void main(String[] args) {

        DataHolder myDataHolder = new DataHolder();

        new Greeting("Hello");
        new Greeting("World!");

        System.out.println(myDataHolder);
        // expected output: Hello World!

    }

}



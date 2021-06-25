package com.example.demo;

public class DemoApplication {

    public static void main(String[] args) {

        DataHolder myDataHolder;


        // first part
        // expected output: Hello World!

        myDataHolder = new DataHolder();
        myDataHolder.addData("hello");
        myDataHolder.addData("world!");
        System.out.println(myDataHolder);



        //second part: comment out the lines 11..14

        //new Greeting("hello");
        //new Greeting("world!");
        //System.out.println(myDataHolder);

        // expected output: Hello World!

    }

}



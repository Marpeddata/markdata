package com.company;

public class Customer {
    private String name;
    private int balance;
    private int age;
    //Constructor
    public Customer(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {

        return this.name;
    }


}

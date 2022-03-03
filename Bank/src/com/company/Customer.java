package com.company;

public class Customer {
    private String name;
    private int balance;
    private int startAmount;
    //Constructor
    public Customer(String name, int startAmount) {
        this.startAmount = startAmount;
        this.name = name;
    }

    public String getName() {

        return this.name;
    }
    @Override
    public String toString() {
        String space = ": ";
        String s = this.name +space+ this.startAmount;
        return s;
    }


}

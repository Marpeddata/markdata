package com.company;

import java.util.ArrayList;

public class Bank {
    //Data
    private String name;
    private String city = "københavn";
    private int employeeNum = 400;
    ArrayList<Customer> customers = new ArrayList<>();


    //Constructor
    public Bank(String name) {
        this.name = name;
    }
    //Sting name is private which makes it unaccessible outsite of a normal function
    //toString function can be used to print out "lollandsbanken","København" and "400"
    //without a getter function.
    @Override
    public String toString() {
        String s = this.name +" "+ this.city +" "+ this.employeeNum;
        return s;
    }
    public void addCustomer(String name, int age) {
        Customer c = new Customer(name, age);
        customers.add(c);
    }






}



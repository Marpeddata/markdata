package com.company;

public class Driver {
    private String name;
    private int age;

    Driver(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        String d = " is driven by "+name;

        return d;
    }

}

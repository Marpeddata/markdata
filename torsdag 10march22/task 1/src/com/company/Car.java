package com.company;

public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    public Car(String make, String model, String bodyStyle, int year){
        this.make = make;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.year = year;
    }
    public void setDriver(Driver driver){

        this.driver = driver;
    }

    public Driver getDriver(){

        return driver;
    }

    @Override
    public String toString() {
        String x = "Make: " + make + ". Model: " + model + " (" + year + "), BodyStyle: " + bodyStyle;

        return x;
    }

}

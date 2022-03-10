package com.company;

public class Main {
    static Driver driver;
    static Car car;
    static Car car2;

    public static void main(String[] args) {
	// write your code here
        driver = new Driver("Mark", 33);
        car = new Car("Ford","GT","Fucking Awesome!",1969);
        car2 = new Car("Shelby","GT500","Legendary",1967);
        car.setDriver(driver);
        car2.setDriver(driver);
        System.out.println(car);
        System.out.println(car.getDriver());
        System.out.println(car2);
        System.out.println(car2.getDriver());



    }
}

package com.company;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    Customer(String firstName,String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    @Override
    public String toString() {
        String x = "Name: " + firstName + " " + lastName + "\n" + "Username: " + userName + "\n";

        return x;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }
}

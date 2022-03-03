package com.company;

import java.util.ArrayList;

public class Bank {
    //Data
    private String name;
    private String city = "københavn";
    private int employeeNum = 400;
    TextUI textUI;

    //Connection to Customer class
    ArrayList<Customer> customers = new ArrayList<>();


    //Constructor
    public Bank(String name) {
        this.name = name;
        this.textUI = new TextUI();
    }
    //Sting name is private which makes it unaccessible outsite of a normal function
    //toString function can be used to print out "lollandsbanken","København" and "400"
    //without a getter function.



    public void startDialog() {
        int choice = 0;
        while(choice != 3) {

            choice = textUI.showUserMenu();
            doAction(choice);
        }



        /*

        */

    }
    private void doAction(int choice) {
        switch(choice){
            case 1:
                System.out.println("Du har valgt at registrere kunde");
                this.registrerCustomer();
                break;

            case 2:
                this.displayCustomers();
                break;


            case 3:
                System.out.println("Hav en god dag!");
                break;

        }



    }

    public void registrerCustomer(){
        String name = textUI.getUserInput("tast kundens navn:");
        int startAmount = Integer.parseInt(textUI.getUserInput("Tast kundens startbeløb:"));
        addCustomer(name, startAmount);
    }

    @Override
    public String toString() {
        String s = this.name +" "+ this.city +" "+ this.employeeNum;
        return s;
    }
    public void addCustomer(String name, int startAmount) {
        Customer c = new Customer(name, startAmount);
        customers.add(c);

    }

    private void displayCustomers() {
        //for each loop
        for(Customer c: this.customers) {
            System.out.println(c);
        }
        //Eksempel med alm for loop
        //for/int i = 0; i < customers.size(); i++){
        //Customer c = customers.get(i)
        //}
    }







}



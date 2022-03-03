package com.company;

import java.util.Scanner;

public class Main {
    static Bank bank;

    public static void main(String[] args) {
       // System.out.println("Progression of the code:");
       // System.out.println("1. Main");
        //Connection to Bank class.
        bank = new Bank("Lollandsbanken");
       // System.out.println("3. Gets name");
        bank.startDialog();
        System.out.println(bank.customers);





        //System.out.println(bank.customers.get(0).getName() + ": " + age);
        //Same as line 9
        // Customer c = bank.customers.get(0);
        // String theName = c.getName();
        // System.out.print(thename);

    }


    }



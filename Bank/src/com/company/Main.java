package com.company;

import java.util.Scanner;

public class Main {
    static Bank bank;

    public static void main(String[] args) {
        bank = new Bank("Lollandsbanken");
        String name = getUserInput("tast kundens navn:");
        int age = Integer.parseInt(getUserInput("Tast kundens alder:"));

        bank.addCustomer(name, age);


        System.out.println(bank.customers.get(0).getName() + ": " + age);
        //Same as line 9
        // Customer c = bank.customers.get(0);
        // String theName = c.getName();
        // System.out.print(thename);

    }
        static String getUserInput(String msg){
            System.out.println(msg);
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            return input;
        }
    }



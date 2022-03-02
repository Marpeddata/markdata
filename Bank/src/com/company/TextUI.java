package com.company;

import java.util.Scanner;

public class TextUI {

     public String getUserInput(String msg){
        //System.out.println("4. getUser");
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        return input;
    }

    public int showUserMenu() {
        System.out.println("1: Registrer kunde");
        System.out.println("2: vis kunder");
        System.out.println("3: exit menu");
         Scanner scan = new Scanner(System.in);
         int choice = scan.nextInt();
         return choice;
    }

}

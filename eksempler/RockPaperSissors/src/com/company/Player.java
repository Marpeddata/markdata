package com.company;

import java.util.Scanner;

public class Player {

    private String name;
    private Scanner scan = new Scanner(System.in);
    private Scanner keyboard = new Scanner(System.in);

    public Player () {

        this.name = null;

    }

    public String getName(){
        System.out.println("Enter your name");
        String userName = scan.nextLine();
        return name;
    }

    public int playerOption(){
        System.out.println("Pick either Rock, Paper or Scissors");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        int pick = keyboard.nextInt();
        return pick;
    }

}

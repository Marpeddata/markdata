package com.company;

import java.util.Scanner;

public class HumanPlayer{




    public int getAnswer() {
        System.out.println("Pick either Rock, Paper or Scissors");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        Scanner keyboard = new Scanner(System.in);
        int pick = keyboard.nextInt();
        return pick;
    }
}

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Scanner keyboard = new Scanner(System.in);
    Player player = new Player();
    Oponent oponent = new Oponent();

    public Game(){


    }

    void runGame() {

        player.validation(player.playerOption(),oponent.OponentRandom());
        player.whoWon();
        System.out.println(player.whatsTheScore());
        restartTheGame();



    }

    void restartTheGame() {
        System.out.println("Press any key to try again");
        keyboard.next();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        runGame();



    }

        void getName() {
            Scanner scan = new Scanner(System.in);


            System.out.println("Enter your name?");
            String userName = scan.nextLine();

            player.setName(userName);
        }

    }







package com.company;

import java.util.Scanner;

public class Player {

    private String name;
    private int result;
    private int playerScore = 0;
    private int oponentScore = 0;

    private Scanner keyboard = new Scanner(System.in);

    public Player () {

        this.name = null;

    }

    public int playerOption(){
        System.out.println("Pick either Rock, Paper or Scissors");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        int pick = keyboard.nextInt();
        return pick;
    }

    public String whatsTheScore(){

        return name +": " + playerScore + " " + "Computer: " + oponentScore;
    }

    public int validation(int playerAnswer, int oponentAnswer){

        if(playerAnswer == 1 && oponentAnswer == 3){
            return result = 1;
        }
        if(playerAnswer == 1 && oponentAnswer == 2){
            return result = 3;
        }
        if(playerAnswer == 2 && oponentAnswer == 1){
            return result = 1;
        }
        if(playerAnswer == 2 && oponentAnswer == 3){
            return result = 3;
        }
        if(playerAnswer == 3 && oponentAnswer == 2){
            return result = 1;
        }
        if(playerAnswer == 3 && oponentAnswer == 1){
            return result = 3;
        }
        return result = 2;
    }
    public void whoWon(){

        if(result == 1){
            System.out.println(getName() + " won!");
            playerScore++;
        } else if(result == 3) {
            oponentScore++;
            System.out.println("Computer won!");
        } else if(result == 2) {
            System.out.println("its a draw try again");
        }
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }

}

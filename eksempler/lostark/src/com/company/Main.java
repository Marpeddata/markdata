package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //logged out for how long?

        //int absenceHours;

        //Current Work Energy.
        //int currentLife;


        Scanner hours = new Scanner(System.in);
        System.out.println("How many hours will you be gone?");
        int absenceHours = Integer.parseInt(hours.nextLine());
        System.out.println("How much work energy you got currently?");
        Scanner life = new Scanner(System.in);
        int currentLife = Integer.parseInt(life.nextLine());


        int gainPrHour = 180;
        int lifeDifference = 10000 - currentLife;
        int gainedLife = currentLife + absenceHours*gainPrHour;
        int lostLife = lifeDifference - absenceHours*gainPrHour;
        int loginAfter = lifeDifference/180;


        if(absenceHours*gainPrHour <= lifeDifference) {
            System.out.println("You wil have  " + gainedLife + "/10000 WorkEnergy");
        } else if (absenceHours*gainPrHour >= lifeDifference) {
            System.out.println("You gained a total of " + lifeDifference + " to a total of 10000 WorkEnergy." + " And lost " + lostLife + " - Login after " + loginAfter + " Hours to avoid loss");
        }

    }
}

package com.company;

import java.util.ArrayList;

public class Main {





    public static void main(String[] args) {

        YourMom Karen = new YourMom("Karen",9000);
        YourMom Susan = new YourMom("Susan",400);
        YourMom Ashly = new YourMom("Ashly",300);

        ArrayList<YourMom> imInDanger = new ArrayList<>();
        imInDanger.add(Karen);
        imInDanger.add(Susan);
        imInDanger.add(Ashly);


        System.out.println(imInDanger.get(2));


        int[] heaviestMumma = {Karen.getWeight(), Susan.getWeight(), Ashly.getWeight()};

        //For loop to find heaviest momma
        int bathScale = 0;
        for(int i = 0; i < heaviestMumma.length; i++){


            if (heaviestMumma[i] > bathScale) {
                bathScale = heaviestMumma[i];
            }
        }
        System.out.println(bathScale);

    }
}

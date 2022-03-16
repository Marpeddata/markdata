package com.company;

import java.util.Random;

public class Game {


    public Game(){


    }

    void runGame() {


    }


    public void OponentRandom() {

        int min = 1;
        int max = 3;

        Random rn = new Random();
        int result = rn.nextInt(max + min) + min;

        System.out.println(result);



    }


}

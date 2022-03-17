package com.company;

import java.util.Random;

public class PlayerAI{



    public int getAnswer() {
        int min = 1;
        int max = 3;

        Random rn = new Random();
        int result = rn.nextInt(max + min) + min;

        return result;
    }
}

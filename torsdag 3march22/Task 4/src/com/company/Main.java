package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //4.a
        printValue(40);
        //4.b
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10};
        //4.c
        randomNumber(arr);
        //4.d
        recursion(4);
        //4.e
        fiboNac(1, 1);


    }

    public static void recursion(int tempValue) {

        System.out.println(tempValue);
        /*for(int i = 0;i > 0; i--){
            tempValue--;
*/
        tempValue--;
        if (tempValue != 0) {
            //System.out.println(tempValue);
            recursion(tempValue);
        }


    }

    public static void fiboNac(int a, int b) {
        System.out.println(a + "\t" + b);
        if (a + b < 10000) {
            int sum = a + b;
            fiboNac(b, sum);
        }
    }

    public static int randomNumber(int[] tempArr) {

        int rand = new Random().nextInt(tempArr.length);
        return tempArr[rand];

    }

    public static void printValue(int value) {
        for (int i = 0; i < 100; i++) {
            if (i % value == 0) {

                System.out.println(i + " " + value);
            }
        }
    }
}



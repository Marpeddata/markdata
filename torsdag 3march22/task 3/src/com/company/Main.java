package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = { 1, 6423, 64, 6, 3, 123, 61, 6, 36, 1236, 347, 3, 1326, 246, 4 };
        Arrays.sort(array);
        printArray(array);
        System.out.println();

        }
        public static void printArray(int[] arr){
            for(int i = 0; i < arr.length ; i++) {
                System.out.print(arr[i] + " ");
        }
    }
}

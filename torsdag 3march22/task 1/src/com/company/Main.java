package com.company;
// https://github.com/tjorne/cph-1st-w39
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1.a
        int[] array = {8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2};
        //1.c
        sorted(array);
        System.out.println();
        //Task 1 (Algorithms)
        printList(array);
        int buffer;
        // 1.e
        boolean isSorted = false;



        // 1.d
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i<array.length-1; i++){
                if(array[i]>array[i+1]){
                    buffer = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buffer;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }

    }





    //1.b
    public static int[] sorted(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tempI = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempI;
                }
            }
        } return arr;
    }

    public static void printList(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}

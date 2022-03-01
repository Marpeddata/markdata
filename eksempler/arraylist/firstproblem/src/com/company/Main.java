package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args)
    {

        //Declair arraylist and looping over i, counting from 1 to 10
        ArrayList<Integer> numbers= new ArrayList<>();
        for(int i = 1; i < 10+1; i++)
        {
            numbers.add(i);
        //Printing 1,2,3,4,5...10
        } System.out.println(numbers);

        //Reverse is an imported function to reverse the numebers array
        Collections.reverse(numbers);
        //Printing 10,9,8,6...1
            System.out.println(numbers);

        //Declaring an ArrayList
        ArrayList<String> names = new ArrayList<>();
            //Adding data to the string array
            names.add("Mark");
            names.add("Mayas");
            names.add("Lucas");
            names.add("Marcus");
            names.add("Jesper");
        //Sorting method which sort the list of names from A-Z
        Collections.sort(names);
        //Printing the sorted list.
        System.out.println(names);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {

    public ArrayList<String> getPlayerNames(String message) {
        ArrayList<String> data = new ArrayList<>();
        //Show user message
        //System.out.println(message);
        String input = "";

        Scanner scan = new Scanner(System.in);

        //As long as assigned players(via console) is less than the total numbers is less of equal to 6
        while(data.size() <= 6) {
            System.out.println(message);
            //Continues to ask untill "Q" is pressed and this will be ignored.
            if (input.equalsIgnoreCase("Q")) {
                break;
            }
            data.add(input);
        }



        return data;
    }

    }


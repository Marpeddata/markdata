package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {


    ArrayList<String> readGameData(){


    //source of the file we read from
    File file = new File("src/com/company/datatxt");

    //Creating an arraylist to store all data from the data.txt file,
    // to be formatted in games.java
    ArrayList<String> data = new ArrayList<>();
        try {

            //Calling the scanner method just like a class.
        Scanner scan = new Scanner(file);

            //While loop that loops trough the data.txt,
            //untill the last word checked doesnt have a new line
        while(scan.hasNextLine()){
            data.add(scan.nextLine());
        }
         }catch(FileNotFoundException e){
            data = null;
    }
        return data;

    }


}
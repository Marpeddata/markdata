package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("src/com/company/data.txt");

        try {
            Scanner scan = new Scanner(file);
            String[] line;
            while(scan.hasNextLine()){
                line = scan.nextLine().split(", ");
                System.out.println("name:"+line[0]);
                System.out.println("balance:"+line[1]);
                System.out.println("city:"+line[2]);
                System.out.println();


            }
        }catch(FileNotFoundException ex){
            System.out.println("file not found");


        }
        System.out.println("woop woop mofo");

    }
}

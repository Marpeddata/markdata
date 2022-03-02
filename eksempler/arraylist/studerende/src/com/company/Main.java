package com.company;

import java.util.ArrayList;

public class Main{

public static void main(String[]args)
        {
        //Student Call, for all students with their respected parameters from the class.
        Student mark = new Student("Mark", 78, false, "Stud : 1");
        Student mayas = new Student("Mayas", 78, false, "Stud : 2");
        Student foss = new Student("Foss", 78, false, "Stud : 3");
        Student isak = new Student("Isak", 78, false, "Stud : 4");
        Student veronica = new Student("Veronica", 78, true, "Stud : 5");
        Student villiam = new Student("Villiam", 78, false, "Stud : 6");
        Student felicia = new Student("Felicia", 78, true, "Stud : 7");
        Student lucas = new Student("Lucas", 78, false, "Stud : 8");
        Student marcus = new Student("Marcus", 78, false, "Stud : 9");
        Student nikolaj = new Student("Nikolaj", 78, false, "Stud : 10");

        //Added into the arraylist
        ArrayList<Student> student = new ArrayList<Student>();
                student.add(mark);
                student.add(mayas);
                student.add(foss);
                student.add(isak);
                student.add(veronica);
                student.add(villiam);
                student.add(felicia);
                student.add(lucas);
                student.add(marcus);
                student.add(nikolaj);

        }



}
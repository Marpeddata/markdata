package com.company;

public class Student {
    String name;
    int age;
    boolean isFemale;
    String datamatikerTeam;

    public Student(String tmpName, int tmpAge, boolean tmpIsFemale, String tmpDatamatikerTeam) {

        this.name = tmpName;
        this.age = tmpAge;
        this.isFemale = tmpIsFemale;
        this.datamatikerTeam = tmpDatamatikerTeam;

    }

    public String getName() {
        return this.name;
    }

    public String getTeam() {
        return this.datamatikerTeam;
    }
}

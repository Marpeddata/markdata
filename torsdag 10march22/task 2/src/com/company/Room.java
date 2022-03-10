package com.company;

public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;
    private int walls;

    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows, int walls){
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
        this.walls = walls;
    }

    @Override
    public String toString() {
        String s = this.numberOfDoors + " " + this.numberOfWindows + " " + this.walls + " " + this.numberOfLamps;
        return s;
    }

    public int getDoors(){
        return this.numberOfDoors;
    }

    public int getLamps(){
        return this.numberOfLamps;
    }

    public int getWindows(){
        return this.numberOfWindows;
    }

    public int getWalls(){
        return this.walls;
    }




}

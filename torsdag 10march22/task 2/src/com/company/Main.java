package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Room rooms = new Room(3,2,2,4);
        Room rooms2 = new Room(1,1,0,4);
        Room rooms3 = new Room(1,1,0,8);
        Building home = new Building(2,4,false);


        ArrayList<Room> allRooms = new ArrayList<>();
        allRooms.add(rooms);
        allRooms.add(rooms2);
        allRooms.add(rooms3);

        //System.out.println(allRooms);

        if(home.getFloors() > allRooms.size()){
            System.out.println("This is an odd building");
        }

    }
}

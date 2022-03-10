package com.company;

public class Building {
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;
    private Room rooms;


   public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
       this.numberOfBathrooms = numberOfBathrooms;
       this.numberOfFloors = numberOfFloors;
       this.isOfficeBuilding = isOfficeBuilding;
       /*Wanted to pass, the arraylist as an argument, to make the parameter more dynamic for future adding
         Couldnt get it to work, so stuck with a more simple solution in Main.
         --------------------
         this.rooms = rooms;*/


   }
    @Override
    public String toString() {
        String s = this.numberOfBathrooms + " " + this.numberOfFloors + " " + this.rooms;
        return s;
    }


   public int getBathrooms(){
       return numberOfBathrooms;
   }

   public int getFloors(){
       return numberOfFloors;
   }

   public boolean getOffice(){
       return isOfficeBuilding;
   }



}

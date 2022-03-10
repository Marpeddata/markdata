package com.company;

import java.util.ArrayList;

public class Game {
    //creating the new arraylist called "players"
    ArrayList<Player> players = new ArrayList<>();
    //creating a new object "fileIO" from class FileIO
    FileIO fileIO = new FileIO();
    private TextUI textUI = new TextUI();

    //Constructor
    public Game() {

        //Creating an arraylist(called data) to store formated data
        //from readGameData methode/arraylist in FileIO class
        ArrayList<String> data = new ArrayList<>();
        data = fileIO.readGameData();

        //if data file is empty, get user input from console.
        //else create players from file
        if(data == null) {
            //System.out.println("no data");
            data = textUI.getPlayerNames("Skriv spiller navn. Tast Q for at quitte");
        }
            //Refactoring
            this.createPlayers(data);
        }







    private void createPlayers(ArrayList<String> data) {
        //For each loop - splits data every time it reaches a ": "
        //Each seperation is a new index in the arraylist.
        for (String s : data) {
            //System.out.println(s);
            String[] values = s.split(": ");

            //Since the data from the file is string
            //We transform the balance/value into integer.
            
            //int balance = Integer.parseInt(values[1]);
            int balance = Integer.parseInt("30000");

            //calling the Player class creating a new player for each loop
            //player name will be index[0] of the Arraylist above(values),
            //and the balance of this new player will be the index[1] after
            //parsing into integer.
            Player player1 = new Player(values[0], balance);

            //In the end we add the player object to the arraylist from the beginning
            //(players)
            players.add(player1);
        }
    }

}



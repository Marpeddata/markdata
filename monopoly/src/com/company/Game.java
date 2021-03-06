package com.company;

import java.util.ArrayList;

public class Game {
    //creating the new arraylist called "players"
    ArrayList<Player> players = new ArrayList<>();
    //creating a new object "fileIO" from class FileIO
    private FileIO fileIO = new FileIO();
    private TextUI textUI = new TextUI();
    private Dice dice = new Dice();
    private Player currentPlayer;
    private Board board;

    //Constructor
    public Game() {
//loading player data
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

        //vi loader felt data

        String[] fieldData = fileIO.readFieldData();
        System.out.println(fieldData[fieldData.length-1]);
        board = new Board(fieldData);


        //gameloop
        this.currentPlayer = this.players.get(0);
        takeTurn();

    }




private void takeTurn(){
    int diceValue = dice.rollDiceSum();
    textUI.displayMessage(currentPlayer + " Slog " + diceValue);
    int newPosition = currentPlayer.updatePosition(diceValue);
    //Field benyttes her som variable type, den skal kunne rumme alle typer data som field classen har.
    //Det er ikke en instanciering, den benyttes kun som variabel type.
    Field f =  board.getField(newPosition);
    String decisionRequest = f.onLand(currentPlayer);

    String response = textUI.getUserInput(decisionRequest);
    textUI.displayMessage(decisionRequest);
    String processedResponse = f.processResponse(currentPlayer,response);
    System.out.println(processedResponse);


}


    private void createPlayers(ArrayList<String> data) {
        //For each loop - splits data every time it reaches a ": "
        //Each seperation is a new index in the arraylist.
        for (String s : data) {
            //System.out.println(s);
            String[] values = s.split(": ");
            int balance;
            //Since the data from the file is string
            //We transform the balance/value into integer.

            if(values.length > 1) {
                balance = Integer.parseInt(values[1]);
            } else {
                //int balance = Integer.parseInt(values[1]);
                balance = Integer.parseInt("30000");
            }
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



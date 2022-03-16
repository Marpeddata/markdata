package com.company;

public class Player {
    private String name;
    //Class call creating a new BankAccount, named "account"
    private BankAccount account;


    public Player(String name, int balance){
        this.name = name;
        this.account = new BankAccount(balance);
    }
    //Converting the string values to "humanfriendly" info!
    @Override
    public String toString(){

        return name+": "+ account.getBalance();
    }
    // both getters here arent used in the code atm.
    public String getName(){

        return name;
    }

    public int getBalance() {

        return account.getBalance();
    }



}

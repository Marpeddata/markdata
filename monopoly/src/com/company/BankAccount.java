package com.company;

public class BankAccount {
    private int balance;

        //Constructor - used in player class (Data)
    public BankAccount(int balance){
        this.balance = balance;
    }
        //Getter - Used in Player class (toString)
    public int getBalance() {
        return balance;
    }
/*
    void doTransaction(int amount);

    */
public boolean doTransaction(int amount) {
    //int balanceA = balance + amount;
    this.balance = balance + amount;

    if (balance > 0) {
        //System.out.println("True");
        return true;
    } else {
        return false;
    }
}
}


package com.company;

public class Main {
    static Ingredients onion;
    static Ingredients groundBeef;
    static Ingredients canedTomatos;
    static Ingredients garlic;



    public static void main(String[] args) {
    onion = new Ingredients("Løg",2);
    groundBeef = new Ingredients("Hakket Oksekød",500);
    canedTomatos = new Ingredients("Hakkede Tomater",200);
    garlic = new Ingredients("Hvidløg",5);




        System.out.println(onion.getName()+": "+onion.getQuantity());
        System.out.println(groundBeef.getName()+": "+groundBeef.getQuantity());
        System.out.println(canedTomatos.getName()+": "+canedTomatos.getQuantity());
        System.out.println(garlic.getName()+": "+garlic.getQuantity());

    }
}

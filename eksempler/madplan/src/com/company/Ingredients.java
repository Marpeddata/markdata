package com.company;


public class Ingredients
{
        //Data
        String name;
            //in grams
        int quantity;

        //Constructor
    Ingredients(String name, int quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }
        //Setters and getter constructors
    public String getName()
    {
        return this.name;
    }

    public void setName(String newIngredient)
    {
        this.name = newIngredient;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public void setQuantity(int newQuantity)
    {
        this.quantity = newQuantity;
    }


}

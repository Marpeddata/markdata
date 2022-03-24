package com.company;

public abstract class Tax extends Consequence {

    public Tax(int id, String label, int cost, int income) {

        super(id, label, cost, income);
    }
}

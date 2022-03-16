package com.company;

public class YourMom {
    private Boolean isSheFat = true;
    private int weight;
    private String name;

    @Override
    public String toString() {
        return name + " " + weight;
    }

    YourMom(String name, int weight){
        this.weight = weight;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }
}

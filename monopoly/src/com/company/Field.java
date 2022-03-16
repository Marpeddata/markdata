package com.company;

public class Field {
    private String label;
    private String fieldType;
    private int ID;
    private int cost;
    private int income;
    private int seriesID;
    private Player owner;

    public Field(int ID,String label,String fieldType,int cost,int income,int seriesID) {
        this.ID = ID;
        this.label = label;
        this.fieldType = fieldType;
        this.cost = cost;
        this.income = income;
        this.seriesID = seriesID;
    }
    public String onLand(Player player){
        if(fieldType == "plot"){
            if(owner == player){
                return "Vill du købe? Y for ja, N for nej";
            } else {
                return "pay rent";
            }
        }


            return "do something else";
    }

    public String onProcess(String response){
        return null;
    }

    private String onAccept(Player player){
        return null;
    }

    private void onReject(Player player){

    }

    @Override
    public String toString(){
        return ID + " " + label;
    }

}

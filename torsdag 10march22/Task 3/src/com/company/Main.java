package com.company;

import java.util.ArrayList;


public class Main {
    static Customer mark;
    static Customer peter;
    static Customer hans;
    static Customer torben;
    static Customer janni;
    static Customer bob;





    public static void main(String[] args) {



        ArrayList<Customer>customers = new ArrayList<>();
        customers.add(mark = new Customer("Mark","Pedersen","Lastscene"));
        customers.add(peter = new Customer("Peter","Petersen","Mogens"));
        customers.add(hans = new Customer("Hans","Hansen","Hisass"));
        customers.add(torben = new Customer("Torben","Jørgensen","Toby"));
        customers.add(janni = new Customer("Janni","Jørgensen","JaDav"));
        customers.add(bob = new Customer("Bob","Bob","Bobber"));


            for (Customer profile : customers) {
                System.out.println(profile);
            }





    }

}

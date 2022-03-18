package com.company.demo;

import com.company.implementation.aninmals.birds.PenguinImpl;
import com.company.implementation.aninmals.birds.SeagullImpl;
import com.company.implementation.aninmals.mammals.CatImpl;
import com.company.implementation.aninmals.mammals.DogImpl;
import com.company.model.Animal;
import com.company.model.animals.Bird;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new SeagullImpl());
        animals.add(new DogImpl());
        animals.add(new PenguinImpl());
        animals.add(new CatImpl());

        //time ot feed!

        for(Animal a: animals){
            System.out.println(a.feed());
            System.out.println(a.makeSound());
        }
        //calling the array of birds to make them clean their feathers
        ArrayList<Bird> result = new ArrayList<>();
        for(Animal a : animals){
            if(a instanceof Bird) {
                //casting a to be Bird(since a is already animal)
                System.out.println(result.add((Bird) a));
            System.out.println(((Bird)a).cleanFeathers());
        }
    }




    }
}

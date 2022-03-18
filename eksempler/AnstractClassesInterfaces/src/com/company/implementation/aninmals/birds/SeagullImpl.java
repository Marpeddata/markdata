package com.company.implementation.aninmals.birds;

import com.company.model.animals.birds.Seagull;

public class SeagullImpl implements Seagull {

    @Override
    public String feed() {
        return "The gull eats french fries";
    }

    @Override
    public String makeSound() {
        return "Caw Motherfucker";
    }

    @Override
    public String cleanFeathers() {
        return "the Seagull sits and cleans its feathers!";
    }
}

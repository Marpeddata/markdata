package com.company.implementation.aninmals.birds;

import com.company.model.animals.birds.Penguin;

public class PenguinImpl implements Penguin {

    @Override
    public String feed() {
        return "the penguin eas a herring";
    }

    @Override
    public String makeSound() {
        return "Errrr";
    }

    @Override
    public String cleanFeathers() {
        return "The penguin cleans its feather by taking a swim";
    }
}

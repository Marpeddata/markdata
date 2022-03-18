package com.company.implementation.aninmals.mammals;

import com.company.model.animals.mammals.Cat;

public class CatImpl implements Cat {
    @Override
    public String feed() {
        return "the cat eats a mouse";
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}

package com.company.implementation.aninmals.mammals;

import com.company.model.animals.mammals.Dog;

public class DogImpl implements Dog {

    @Override
    public String feed() {
        return "the dog eats a bone";
    }

    @Override
    public String makeSound() {
        return "wuuf wuuf";
    }
}

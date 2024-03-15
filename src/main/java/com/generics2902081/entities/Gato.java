package com.generics2902081.entities;

public class Gato extends Pet implements IEats{

    public Gato(String type) {
        super(type);
    }

    @Override
    public void eats() {
        throw new UnsupportedOperationException("Unimplemented method 'eats'");
    }

}

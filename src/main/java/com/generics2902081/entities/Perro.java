package com.generics2902081.entities;

public class Perro extends Pet implements IEats{

    public Perro(String type) {
        super(type);
    }

    @Override
    public void eats() {
        throw new UnsupportedOperationException("Unimplemented method 'eats'");
    }
    
}

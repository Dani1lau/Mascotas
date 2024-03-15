package com.generics2902081.entities;

public class Canario extends Pet implements IEats{

    public Canario(String type) {
        super(type);
    }

    @Override
    public void eats() {
        throw new UnsupportedOperationException("Unimplemented method 'eats'");
    }
    

}

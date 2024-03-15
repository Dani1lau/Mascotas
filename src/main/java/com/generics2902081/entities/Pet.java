package com.generics2902081.entities;

public class Pet {
    
    public Pet(String type) {
        this.type = type;
    }

    protected String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}

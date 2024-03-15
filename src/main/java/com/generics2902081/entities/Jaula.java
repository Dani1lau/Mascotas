package com.generics2902081.entities;

public class Jaula<E extends Pet & IEats> {
    private E pet1;
    private E pet2;

    public Jaula(E pet1, E pet2) {
        this.pet1 = pet1;
        this.pet2 = pet2;
    }

    public E getPet1() {
        return pet1;
    }

    public void setPet1(E pet1) {
        this.pet1 = pet1;
    }

    public E getPet2() {
        return pet2;
    }

    public void setPet2(E pet2) {
        this.pet2 = pet2;
    }

    // alimentar las mascotas
    // enjauladas
    public void alimentarMascotas() {
        this.pet1.eats();
        this.pet2.eats();
    }

}

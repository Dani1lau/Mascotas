package com.generics2902081;

import java.util.HashMap;
import java.util.Map;

import com.generics2902081.entities.Canario;
import com.generics2902081.entities.Gato;
import com.generics2902081.entities.Jaula;
import com.generics2902081.entities.Perro;

public class PetStore {

    public static void main(String[] args) {
        Map<String, Jaula<?>> PetStore = new HashMap<String, Jaula<?>>();

        PetStore.put("J1",
                new Jaula<>(new Perro("canino"),
                        new Gato("felino")));

        PetStore.put("J2",
                new Jaula<>(new Canario("ave"),
                        new Canario("ave")));

        //evidencia final
        //Recorrer el mapa
        //Para alimentar cada mascota 
        for (Map.Entry<String , Jaula<?>> m: PetStore.entrySet()){
            System.out.println("IDENTIFICADOR DE JAULA: " + m.getKey());
            System.out.println("JAULA");
            System.out.println("tipo mascota 1" + 
                                m.getValue().
                                getPet1().
                                getType());
                                System.out.println("-------");
            
        }

        for (Map.Entry<String , Jaula<?>> m: PetStore.entrySet()){
            System.out.println("IDENTIFICADOR DE JAULA: " + m.getKey());
            System.out.println("JAULA");
            System.out.println("tipo mascota 2" + 
                                m.getValue().
                                getPet2().
                                getType());
                                System.out.println("-------");
            
        }


    }

}

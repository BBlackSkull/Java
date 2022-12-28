package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args){

        Map<String, String> personas = new HashMap<>();

        personas.put("123456", "nombre 1");
        personas.put("1231256", "nombre 2");
        personas.put("1223256", "nombre 3");

        System.out.println(personas);

        //muestra las key (el primer valor del map)
        for(String key : personas.keySet()){

            System.out.println(key);
        }

        //muestra el segundo valor del map ( los valores)
        for(String value : personas.values()){

            System.out.println(value);
        }
    }
}

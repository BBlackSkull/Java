package ejercicios.funciones;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        
        nombres.add("Andres");
        nombres.add("Jorgeee");
        nombres.add("Juan");
        nombres.add("Raul");

        //System.out.println(nombres);

        for(String nombre : nombres) {

            System.out.println(nombre);

        }
    }
}

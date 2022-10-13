package Condicionales;

import java.util.ArrayList;
import java.util.List;

public class ArrayFor {
    public static void main(String[] args) {
     // List listaAmigos = new ArrayList();
      List <String> listaAmigos = new ArrayList<String>();
      listaAmigos.add("facundo");
      listaAmigos.add("joaquin");
      listaAmigos.add("german");
      listaAmigos.add("gonzalo");


       for (int i = 0; i < listaAmigos.size(); i++) {
           System.out.println(listaAmigos.get(i));
       }
    }
}

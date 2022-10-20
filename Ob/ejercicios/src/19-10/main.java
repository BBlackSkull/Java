package pooDH;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre, apellido, iniciales;
        iniciales = "";
        int dia, mes, anio;
        System.out.println("Ingresa tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingresa tu apellido");
        apellido = scanner.nextLine();
        System.out.println("Dia");
        dia = scanner.nextInt();
        System.out.println("Mes");
        mes = scanner.nextInt();
        System.out.println("Año");
        anio = scanner.nextInt();

        System.out.println(nombre + " " + apellido + " " +  dia+ "/" + mes + "/" + anio);

    }

};
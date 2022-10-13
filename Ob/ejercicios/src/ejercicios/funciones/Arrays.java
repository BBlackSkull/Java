package ejercicios.funciones;

public class Arrays {
    public static void main(String[] args) {


        String nombre1 = "Juan";
        String nombre2 = "Pedro";
        String nombre3 = "Jorgeee";

        String[] nombres = new String[3];
        String[] nombres2 = new String[]{"maria","roberta","josefa"};
        int[] numeros = new int[5];

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;
        for(int i = 0; i < nombres2.length; i++){
            System.out.println(nombres2[i]);
        }

    }
}

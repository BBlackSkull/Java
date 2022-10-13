package Condicionales;

public class Condicionales {
    public static void main(String[] args) {
        int numeroEntero1 = 30;
        int numeroEntero2 = 20;
        String estaLindo = "soleado";
        String estaFeo = "lluvioso";
        mayorOMenor(numeroEntero1, numeroEntero2);
        elDia(estaFeo);
        elDia(estaLindo);
        int array[] = new int[]{1,2,3,4,5};

        acumulador(array);
    }

        public static void  mayorOMenor ( int num1, int num2 ){



                if ( num1 >  num2) {
                    System.out.println("El primero es mas grande");
                } else {
                    System.out.println("El segundo es mas grande" );
                }


        }
        public static void  elDia(String dia) {
        switch (dia) {
            case "lluvioso":

            System.out.println("el dia esta feo");
                break;
            case "soleado":

            System.out.println("el dia esta lindo ");
                break;

            default:
                System.out.println("no se encontro el dia ");
        }
        }
        public static void acumulador(int[] array){
            int acc = 0;
        for (int i = 0; i < array.length; i++) {
            acc += array[i];



        }

            System.out.println(acc);
        }



}



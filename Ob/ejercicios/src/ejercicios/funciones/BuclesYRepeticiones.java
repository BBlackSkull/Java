package ejercicios.funciones;

public class BuclesYRepeticiones {
    public static void main(String[] args) {
        int edad4 = 10;
        int edad2 = 18;
        int edad3 = 30;

        esMenor(edad3);



    }

    public static int esMenor(int par) {

        if (par < 18) {
            System.out.println("sos menor no podes pasar");
        } else if (par >= 18) {
            System.out.println("podes pasr");
        }
        return  par;
    }


}



public class Funciones {
    public static void main(String[] args) {
     //holaMundo();
      //  holaMundo( "Yamall");
        String hola = devolverTexto();
        System.out.println("hola");
    }

    private static void holaMundo() {
        System.out.println("Hola mundo en funcion y metodo");
    }
    private static void holaMundo(String name){
        System.out.println("Hola  " + name);

    }
    private static String devolverTexto(){
        return "Hola";

    }
}

public class Polimorfismo {
    public static void main(String[] args) {

        POOCar coche1 = new CocheHibrido();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        //polimorfismo

        POOCar coche4 = new CocheHibrido();
        POOCar coche5 = new CocheElectrico();

        if( coche4 instanceof CocheHibrido ){ //instanceof es para comprobar si es el mismo tipo de objeto
            System.out.println("es un coche hibrido");
        }
        if ( coche4 instanceof CocheElectrico ){
            System.out.println("es un coche electrico");
        }
    }
}


public class CocheMain {
    public static void main(String[] args) {

        String coche = "alfa romeo";


        POOCar cocheobj1  = new CocheElectrico("motor","rojo", "alfa romeo", "giuliette",2.500, 3.20);

        cocheobj1.acelerar(80);

        System.out.println(cocheobj1);

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "negro";
        cocheElectrico.fabricante=  "tesla";
        cocheElectrico.modelo = "Model 3";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("800khw","verde", "hyundai" ,
                "kona", 2800d,3.55);
        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);

        System.out.println(cocheElectrico2);

    }
}

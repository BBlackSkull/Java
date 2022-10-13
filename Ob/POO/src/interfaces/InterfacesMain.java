package interfaces;

public class InterfacesMain {
    public static void main(String[] args) {

        CocheService service = new CocheServiceClassicImpl(); // polimorfimo sobre clases
        POOCar coche1 = service.crearCocheDemo();
    }
}

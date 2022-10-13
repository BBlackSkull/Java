package interfaces;

import interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {

    @Override
    public POOCar crearCocheDemo() {
        System.out.println("creando coche clasico...");
        return new CocheElectrico();
    }
}

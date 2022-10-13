public class CocheElectrico extends POOCar {
    String motorElectrico;
     public CocheElectrico(){
     }
     public CocheElectrico(String motorElectrico) {
         this.motorElectrico = motorElectrico;
     }
     public CocheElectrico(String motorElectrico, String color, String fabricante, String modelo, Double peso, Double largo){
         super(color, fabricante, modelo, peso, largo);
         this.motorElectrico = motorElectrico;
     }
     @Override
     public void acelerar(Integer cantidad){
         Integer cantidadAjustada = cantidad * 2; //<- ajustando el valor de cantidad
         super.acelerar(cantidadAjustada);
    }
    @Override
    public String toString() {
        return "CocheElectrico{" +
                "MotorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}

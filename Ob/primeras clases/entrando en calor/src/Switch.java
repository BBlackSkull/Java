public class Switch {
    public static void main(String[] args) {
        String weather = "clody";
        switch (weather){
            case "sunny":
                System.out.println("El tiempo esta soleado");
                break;
            case "cloudy":
                System.out.println("El dia esta nublado");
                break;
            default:
                System.out.println("No se ha podido identificar el clima");
                break;
        }
    }
}

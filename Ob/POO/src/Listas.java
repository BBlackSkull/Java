import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List empleados = new ArrayList();
        empleados.add("Juan");
        empleados.add("Luis");
        empleados.add("Maria");
        empleados.add("Paulo");
        empleados.add("Sofia");
        //System.out.println(empleados.indexOf("Juan"));
        //para eliminar un empleado empleados.remove(0) o el nombre ("juan")
       /* for(int i = 0; i < empleados.size(); i++){
            System.out.println(empleados.get(i));
        }*/

        //empelados.clear(); muestra si tiene algun elemento en utilidad
        // empleados.isEmpty(); nos devuelve un boolean consultando si verificando si esta o no el valor pasado
         empleados.set(0, "Felix"); // cambia el nombre en ese indice por el nombre asignado
        Iterator i = empleados.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

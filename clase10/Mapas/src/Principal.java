import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {

        HashMap<String, Float> temperaturas = new HashMap<>(0);

        temperaturas.put("Lunes", 23f);
        temperaturas.put("Martes", 27f);
        temperaturas.put("Jueves", 21f);

        for(String nom: temperaturas.keySet())
            System.out.println(nom);

        for(Float t: temperaturas.values())
            System.out.println(t);

        for(Map.Entry<String, Float> entrada: temperaturas.entrySet()) {
            System.out.printf("Para el %s se esperan %f grados\n", entrada.getKey(), entrada.getValue());
        }
    }

}

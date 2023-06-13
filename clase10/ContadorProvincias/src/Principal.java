import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("CP.txt"));
        HashMap<String, Contador> contador = new HashMap<>();

        while(sc.hasNextLine()) {
            String linea = sc.nextLine();
            String provincia = linea.split(";")[0];
            if (!contador.containsKey(provincia))
                contador.put(provincia,new Contador());
            contador.get(provincia).contar();
        }

        for (Map.Entry<String, Contador> prov: contador.entrySet()) {
            System.out.println(prov.getKey() + " " + prov.getValue().getCantidad());
        }

    }
}

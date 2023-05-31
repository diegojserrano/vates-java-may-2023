import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {


        Scanner sc = new Scanner(new File("CP.txt"));
        Correo c = new Correo();
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            c.agregarCodigo(CodigoPostal.desdeCadena(linea));
        }

        c.buscar("palomas").stream().forEach(System.out::println);
        Map<String, Integer> totales = c.cantidadPorProvincia();
        totales.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " "+ e.getValue()));

    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Principal {
    public static void main(String[] args) throws IOException {


        //Scanner sc = new Scanner(new File("CP.txt"));
        Correo c = new Correo();
        //while (sc.hasNextLine()) {
        //    String linea = sc.nextLine();
        //    c.agregarCodigo(CodigoPostal.desdeCadena(linea));
        //}

        Files.readAllLines(Paths.get("CP.txt")).stream()
                .map(CodigoPostal::desdeCadena)
                .forEach(c::agregarCodigo);


        Consumer<Object> imprimir = System.out::println;
        Consumer<Map.Entry> imprimirEntry = e -> imprimir.accept(e.getKey() + " "+ e.getValue());

        Predicate<Integer> esPar = n -> n % 2 == 0;

        Predicate<Integer> esImpar = esPar.negate();

        c.buscar("palomas").stream().forEach(imprimir);
        Map<String, Long> totales = c.cantidadPorProvincia();
        totales.entrySet().stream().forEach(imprimirEntry);

    }
}

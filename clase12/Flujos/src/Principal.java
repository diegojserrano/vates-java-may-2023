import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {

        Random r = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        Predicate<Integer> esPositivo = n -> n > 0;
        Predicate<Integer> esPar = n -> n % 2 == 0;

        for (int i = 0; i < 10; i++) {
            numeros.add(r.nextInt(-1000,1000));
        }

        System.out.println("Listado de los números generados (con forEach)");
        for (Integer n: numeros)
            System.out.println(n);


        System.out.println("Listado de los números generados (con stream)");
        //numeros.stream().forEach(n -> System.out.println(n));
        numeros.stream().sorted().forEach(System.out::println);
        // Porque println tiene los mismos parámetros y retorno que Consumer
        // Entonces "se disfraza" de Consumer

        System.out.println("Listado de los números positivos");
        numeros.stream()
                .filter(esPositivo)
                .forEach(System.out::println);

        System.out.println("El mayor");
        int mayor = numeros.stream().max(Comparator.naturalOrder()).get();
        System.out.println(mayor);

        System.out.println("El mayor de los pares");
        System.out.println(
                numeros
                    .stream()
                    .filter(esPar)
                    .max(Comparator.naturalOrder())
                    .orElse(Integer.MIN_VALUE)
        );

        System.out.println("Cuadrados de todos");
        numeros.stream().map(n -> n * n).forEach(System.out::println);

        System.out.println("Raices cuadradas de todos");
        numeros.stream().filter(esPositivo).map(Math::sqrt).forEach(System.out::println);

        System.out.println("Sumatoria de todos");
        System.out.println(numeros.stream().reduce(Integer::sum).orElse(0));

        IntSummaryStatistics estadisticas = numeros.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Suma: " + estadisticas.getSum());
        System.out.println("Promedio: " + estadisticas.getAverage());
        System.out.println("Maximo: " + estadisticas.getMax());
        System.out.println("Minimo: " + estadisticas.getMin());

        System.out.println("Sumatoria de todos los pares");
        System.out.println(numeros.stream().filter(esPar).peek(System.out::println).mapToInt(Integer::intValue).sum());
    }

}

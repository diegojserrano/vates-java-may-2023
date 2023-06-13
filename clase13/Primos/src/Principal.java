import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        Primos.iniciar();
        System.out.println(Primos.texto());

        List<Long> num = new Random().longs(100,1,Long.MAX_VALUE).boxed().toList();


        long inicio = System.currentTimeMillis();
        for (Long n: num)
            System.out.println(n + " " + Primos.esPrimo(n));
        long fin = System.currentTimeMillis();
        long duracion = fin - inicio;
        System.out.println("Tiempo: " + duracion);
    }
}


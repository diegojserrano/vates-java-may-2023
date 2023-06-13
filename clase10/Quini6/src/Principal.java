import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        Random r = new Random();

        Juego j = new Juego();

        // Generación de las apuestas

        for (int i = 0; i < 1000000; i++) {
            Boleta b = new Boleta(i,"Boleta " + i);
            while(b.cantidadNumeros() < 6)
                b.agregarNumero(r.nextInt(1,47));
            j.agregarBoleta(b);
        }

        // Simular el juego
        boolean hayGanadores = false;
        while (!hayGanadores) {
            while(!j.agregarSorteado(r.nextInt(1,47)));
            ArrayList<Boleta> ganadoras = j.ganadoras();
            if (!ganadoras.isEmpty()) {
                hayGanadores = true;

                System.out.println("Sorteo: " + j.toString());
                for (Boleta b: ganadoras)
                    System.out.println(b);
            }
        }

    }
}

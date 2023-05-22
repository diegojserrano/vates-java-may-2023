/* Insertar 100000 números al azar en una colección de tipo ArrayList

Los números deben ser enteros entre -100000 y 100000
Luego de finalizada la carga mostrar:
  * La cantidad de elementos insertados (método size())
  * Si existe o no el número 35654
  * Los primeros 100 números al recorrerlo con for mejorado

Medir el tiempo en milisegundos que demora la carga
*/

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Random r = new Random();

        System.out.println("Con un ArrayList");
        ArrayList<Integer> lista = new ArrayList<>();
        probarColeccion(lista);

        System.out.println("Con un HashSet");
        HashSet<Integer> conjunto = new HashSet<>();
        probarColeccion(conjunto);

        System.out.println("Con un TreeSet");
        TreeSet<Integer> arbol = new TreeSet<>();
        probarColeccion(arbol);

    }

    private static void probarColeccion(Collection<Integer> coleccion) {

        Random r = new Random(2345);
        long inicio = System.currentTimeMillis(); // La hora actual en milisegundos
        int i;
        for (i = 0; i < 100000; i++) {
            int x = r.nextInt(-100000, 100000);
            coleccion.add(x);
            //if (i <= 10) System.out.println(x);
        }
        long fin = System.currentTimeMillis();
        long duracion = fin - inicio;
        System.out.println("Para ingresar demoró " + duracion);
        System.out.println(coleccion.size());
        int encontrados = 0;
        inicio = System.currentTimeMillis();
        for (i = 0; i < 100000; i++) {
            int buscado = r.nextInt(-100000, 100000);
            boolean existe = coleccion.contains(buscado);
            if (existe) encontrados++;
        }
        fin = System.currentTimeMillis();
        duracion = fin - inicio;
        System.out.println("Cantidad de encontrados: " + encontrados);
        System.out.println("Para buscar demoró " + duracion);

        i = 0;
        for(Integer x: coleccion) {
            if (++i == 10) break;
            System.out.println(x);
        }

    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // Cargar números hasta que se ingrese 0.
        // Buscar el mayor;
        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaNombres = new ArrayList<>();

        listaNombres.add("Lunes");
        listaNombres.add("Martes");
        listaNombres.add("Miercoles");
        listaNombres.add("Jueves");

        //for (int i = 0; i < listaNombres.size(); i++) {
        //    System.out.println(listaNombres.get(i));
        //}
        // Para cada nombre que pertenece a la listaNombres
        for(String cadaNombre: listaNombres) {
            if (cadaNombre.contains("r"))
                System.out.println(cadaNombre);
        }


        int x = 45;
        Integer y = 45;
        // x es una variable de un tipo primitivo
        // y es un objeto cuyo atributo value vale 45

//        ArrayList<Integer> listaNumeros = new ArrayList<>();
//
//        System.out.println("Ingrese números. Fin con 0.");
//        int n = sc.nextInt();
//
//        while (n != 0) {
//            listaNumeros.add(n);
//
//            n = sc.nextInt();
//        }
//
//        int suma = 0;
//        for(Integer cadaNumero: listaNumeros) {
//           suma += cadaNumero;
//        }
//
//        System.out.println("La suma es: " + suma);

        ConjuntoEnteros c = new ConjuntoEnteros();

        System.out.println("Ingrese números. Fin con 0.");
        int n = sc.nextInt();

        while (n != 0) {
            c.agregar(n);

            n = sc.nextInt();
        }

        System.out.println("La suma es: " + c.suma());
        System.out.println("El promedio es: " + c.promedio());
        System.out.println("La desvación estándar es: " + c.desviaciónEstándar());


    }
}

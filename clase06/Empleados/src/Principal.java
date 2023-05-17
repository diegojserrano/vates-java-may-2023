import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {


        Obrero o = new Obrero(12234, "Juan", 100000, 22);
        Administrativo a = new Administrativo(1234, "Pedro", 100000, true);
        Vendedor v = new Vendedor(23453, "Ana", 100000, 2000000);
        //Empleado e = new Empleado(11111, "Gabriela", 100000);
        Jerarquico j = new Jerarquico(5554, "Fabricio", 100000,50000);


        ArrayList<Empleado> plantel = new ArrayList<>();
        plantel.add(o);
        plantel.add(a);
        plantel.add(v);
        plantel.add(j);

        String guion = "-";
        System.out.println(guion.repeat(37));
        System.out.printf("| %-33s |\n", "Listado de sueldos");
        System.out.println(guion.repeat(37));

        for(Empleado e: plantel) {
            // En cada vuelta ejecuta potenciales diferentes versiones de calcularSueldo
            // Siempre es la versión correcta
            System.out.printf("| %-15s | %15.2f |\n", e.getNombre(), e.calcularSueldo()); // Llamada polimórfica
            // Alternativa
            String linea = String.format("| %-15s | %15.2f |\n",e.getNombre(), e.calcularSueldo());
            // Luego la línea puede ser concatenada.
        }
        System.out.println(guion.repeat(37));

        double suma = 0;
        for(Empleado e: plantel)
            suma += e.calcularSueldo();

        System.out.println("Total a pagar: " + suma);

        int c_presentismo = 0;

        for(Empleado e: plantel)
            if (e instanceof Administrativo adm && adm.isPresentismo()) { // instanceof mejorado
                c_presentismo++;
            }

        System.out.println("Administrativos con presentismo: " + c_presentismo);
    }
}

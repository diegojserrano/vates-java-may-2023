import java.util.HashSet;
import java.util.Set;

public class Boleta {

    private int numero;
    private String apostador;

    private Set<Integer> apostados;

    public Boleta(int numero, String apostador) {
        this.numero = numero;
        this.apostador = apostador;
        this.apostados = new HashSet<>();
    }

    public boolean agregarNumero(int nuevo) {
        return apostados.add(nuevo);
    }

    public int cantidadNumeros() {
        return apostados.size();
    }

    public int cantidadAciertos(Set<Integer> sorteados) {
        Set<Integer> acertados = new HashSet<>(sorteados);
        // Interseccion entre sorteados y apostados
        // Necesitamos una copia porque retainAll es una operación destructiva
        acertados.retainAll(apostados);
        return acertados.size();
    }

    public boolean esGanadora(Set<Integer> sorteados) {
        return sorteados.containsAll(apostados);
    }

    @Override
    public String toString() {
        return numero + " " + apostador + ": " + apostados.toString();
    }
}

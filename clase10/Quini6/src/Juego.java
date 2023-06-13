import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Juego {

    private ArrayList<Boleta> boletas;
    private HashSet<Integer> sorteados;

    public Juego() {
        boletas = new ArrayList<>();
        sorteados = new HashSet<>();
    }

    public void agregarBoleta(Boleta nueva) {
        boletas.add(nueva);
    }

    public boolean agregarSorteado(int nuevo) {
        return sorteados.add(nuevo);
    }

    public ArrayList<Boleta> ganadoras() {
        ArrayList<Boleta> salida = new ArrayList<>();
        for (Boleta b: boletas)
            if (b.esGanadora(sorteados))
                salida.add(b);
        return salida;
    }

    @Override
    public String toString() {
        return sorteados.toString();
    }
}

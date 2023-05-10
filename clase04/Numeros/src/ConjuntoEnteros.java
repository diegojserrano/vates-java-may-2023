import java.util.ArrayList;

public class ConjuntoEnteros {

    private ArrayList<Integer> numeros;

    public ConjuntoEnteros() {
        numeros = new ArrayList<>();
    }

    public void agregar(Integer nuevo) {
        numeros.add(nuevo);
    }

    public int suma() {
        int suma = 0;
        for(Integer x: numeros)
            suma += x;
        return suma;
    }

    public int cantidad() {
        return numeros.size();
    }

    public double promedio() {
        return (double)suma() / cantidad();
    }

    public double varianza() {
        double suma = 0;
        double promedio = promedio();
        for(Integer x: numeros)
            suma += Math.pow(x - promedio,2);
        return suma/cantidad();
    }

    public double desviaciónEstándar() {
        return Math.sqrt(varianza());
    }

}

/**
 *  Programar la clase genérica Par<T> que permita almacenar un par
 * de objetos del mismo tipo. La clase debe ofrecer métodos para
 * • Intercambiar los componentes del par
 * • Devolver un nuevo par con los mismos componentes pero transpuestos
 * • Informar si los componentes son iguales, diferentes y están en
 * orden ascendente o descendente
 * • Compararse con otro par con orden lexicográfico, implementan-
 * do Comparable<Par<T>>
 *
 */

public class Par<T extends Comparable<T>> implements Comparable<Par<T>> {

    private T c1, c2;


    public boolean iguales() {
        return c1.equals(c2);
    }

    public boolean distintos() {
        return !iguales();
    }

    public boolean ascendente() {
        return c1.compareTo(c2) < 0;
    }

    public boolean descendente() {
        return c1.compareTo(c2) > 0;
    }

    public Par(T c1, T c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    public T getC1() {
        return c1;
    }
    public void setC1(T c1) {
        this.c1 = c1;
    }
    public T getC2() {
        return c2;
    }
    public void setC2(T c2) {
        this.c2 = c2;
    }
    @Override
    public String toString() {
        return "(" + c1 + ", " + c2 + ")";
    }

    public void intercambiar() {
        T aux = c1;
        c1 = c2;
        c2 = aux;
    }

    public Par<T> transponer() {
        return new Par<>(c2, c1);
    }

    @Override
    public int compareTo(Par<T> otro) {
        if (this.c1.equals(otro.c1))
            return this.c2.compareTo(otro.c2);
        return this.c1.compareTo(otro.c1);
    }




}

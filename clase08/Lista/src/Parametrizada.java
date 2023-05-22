public class Parametrizada<E> {

    private E dato;


    public Parametrizada(E dato) {
        this.dato = dato;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Parametrizada{" + getDato().getClass().getName() + ", " +
                "dato=" + dato +
                '}';
    }
}

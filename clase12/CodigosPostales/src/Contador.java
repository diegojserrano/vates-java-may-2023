public class Contador {

    private int c = 0;

    public void contar() {
        c++;
    }

    public int getCantidad() {
        return c;
    }

    @Override
    public String toString() {
        return  String.valueOf(c);
    }
}

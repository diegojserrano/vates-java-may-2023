public class Articulo implements Comparable {

    private int codigo;

    private String nombre;
    private double precio;

    public Articulo(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("%3d %-20s %8.2f", codigo, nombre, precio);
    }

    @Override
    public int compareTo(Object o) {
        // compara this con o, devuelve:
        // negativo si this < o
        // 0 si this == o
        // positivo si this > o
        Articulo otro = (Articulo)o;
        return this.nombre.compareTo(otro.nombre);
    }
}

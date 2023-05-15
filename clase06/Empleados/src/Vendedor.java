public class Vendedor extends Empleado {

    private double totalVentas;

    public Vendedor(int legajo, String nombre, double sueldoBasico, double totalVentas) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBasico() + 0.01 * totalVentas;
    }
}

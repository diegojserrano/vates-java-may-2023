public class Jerarquico extends Empleado {
    private double viaticos;

    public Jerarquico(int legajo, String nombre, double sueldoBasico, double viaticos) {
        super(legajo, nombre, sueldoBasico);
        this.viaticos = viaticos;
    }

    public double getViaticos() {
        return viaticos;
    }

    public void setViaticos(double viaticos) {
        this.viaticos = viaticos;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBasico() + viaticos;
    }
}

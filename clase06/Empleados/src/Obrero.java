public class Obrero extends Empleado {

    private int diasTrabajados;

    public Obrero(int legajo, String nombre, double sueldoBasico, int diasTrabajados) {
        super(legajo, nombre, sueldoBasico);
        this.diasTrabajados = diasTrabajados;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBasico() / 20 * diasTrabajados;
    }
}

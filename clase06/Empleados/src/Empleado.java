// No se puede instanciar
// Es obligatoria la herencia

public abstract class Empleado {

    private int legajo;
    private String nombre;

    private double sueldoBasico;

    public Empleado(int legajo, String nombre, double sueldoBasico) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    // Obliga la sobreescritura
    public abstract double calcularSueldo();

}

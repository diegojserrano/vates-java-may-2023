public class Persona {

    private int documento;
    private String nombre;
    private String apellido;
    private int añoNacimiento;

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public Persona() {

    }


    public Persona(int documento, String nombre, String apellido, int añoNacimiento) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoNacimiento = añoNacimiento;
    }


    // Agregar métodos para
    // -  nombre completo
    // -  edad

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    public int edad() {
        return 2023 - añoNacimiento;
    }

    public String toString() {
        return documento + " " + nombre + " " + apellido + " " + añoNacimiento + "(" + edad() + " años)";
    }
}

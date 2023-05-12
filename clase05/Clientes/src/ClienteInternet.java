public class ClienteInternet extends Cliente {

    private String email;
    private String domicilio;

    public ClienteInternet(int codigo, String nombre, String email, String domicilio) {
        super(codigo, nombre);
        this.email = email;
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "ClienteInternet{" +
                "email='" + email + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

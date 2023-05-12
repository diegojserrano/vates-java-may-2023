// Todo cliente de local ES UN cliente
public class ClienteLocal extends Cliente {

    private int sucursal;

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public ClienteLocal(int codigo, String nombre, int sucursal) {
        super(codigo, nombre);
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return this.codigo + " " + this.nombre + " " + this.sucursal;
    }
}

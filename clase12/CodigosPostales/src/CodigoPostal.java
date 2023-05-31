public class CodigoPostal {

    private String provincia;
    private int codigo;
    private String localidad;

    public CodigoPostal(String provincia, int codigo, String localidad) {
        this.provincia = provincia;
        this.codigo = codigo;
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "provincia='" + provincia + '\'' +
                ", codigo=" + codigo +
                ", localidad='" + localidad + '\'';
    }




    public static CodigoPostal desdeCadena(String linea) {
        String [] datos = linea.split(";");
        return new CodigoPostal(datos[0], Integer.parseInt(datos[1]), datos[2]);
    }
}

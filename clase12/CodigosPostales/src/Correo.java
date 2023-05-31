import java.util.*;

public class Correo {

    private ArrayList<CodigoPostal> codigos;

    public Correo() {
        codigos = new ArrayList<>();
    }

    public void agregarCodigo(CodigoPostal nuevo) {
        codigos.add(nuevo);
    }

    public List<CodigoPostal> buscar(String provincia, String localidad) {
        return codigos.stream()
                .filter(c -> c.getProvincia().equalsIgnoreCase(provincia) &&
                        c.getLocalidad().toUpperCase().contains(localidad.toUpperCase()))
                .toList();
    }

    public List<CodigoPostal> buscar(String localidad) {
        return codigos.stream()
                .filter(c -> c.getLocalidad().toUpperCase().contains(localidad.toUpperCase()))
                .toList();
    }

    public List<CodigoPostal> buscar(String provincia, int codigo) {
        return codigos.stream()
                .filter(c -> c.getProvincia().equalsIgnoreCase(provincia) &&
                        c.getCodigo() == codigo)
                .toList();
    }

    public Map<String, Integer> cantidadPorProvincia() {
        Map<String, Contador> cantidades = new HashMap<>();
        cantidades.put("K", new Contador());
        cantidades.put("X", new Contador());
        cantidades.put("H", new Contador());
        cantidades.put("Otras", new Contador());
        codigos.stream().forEach(c -> cantidades.getOrDefault(c.getProvincia(), cantidades.get("Otras")).contar());
        // Tarea: investigar si se puede hacer con la api de flujos, sin tener que hacer el get del mapa de contadores

        Map<String, Integer> salida = new HashMap<>();
        cantidades.entrySet().stream().forEach(e -> salida.put(e.getKey(), e.getValue().getCantidad()));
        return salida;
    }

}

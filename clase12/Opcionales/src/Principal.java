import java.util.Optional;

public class Principal {

    public static void main(String[] args) {

        Optional<String> nombre1 = Optional.of("Juan");
        Optional<String> nombre2 = Optional.empty();

        //String nombre1 = "Juan";
        //String nombre2 = null;

        System.out.println(nombre1.orElse("No disponible") + " " + nombre2.orElse("No disponible"));

    }


}

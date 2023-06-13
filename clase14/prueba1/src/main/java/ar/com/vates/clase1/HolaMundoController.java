package ar.com.vates.clase1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.stream.IntStream;

// Para que los métodos de esta clase contengan endpoints:
@RestController
public class HolaMundoController {

    // Quiero que se ejecute cuando se reciba una peticion
    // de tipo GET a la url "/"
    @GetMapping("/")
    public String holamundo() {
        return "Hola Mundo!";
    }

    @GetMapping("/hora")
    public long hora() {
        return System.currentTimeMillis();
    }

    @GetMapping("/random")
    public IntStream random() {
        return new Random().ints(100, 1, 1000);
    }

}

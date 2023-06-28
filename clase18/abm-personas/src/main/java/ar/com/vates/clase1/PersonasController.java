package ar.com.vates.clase1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/personas/")
public class PersonasController {

    @Autowired
    private PersonasService servicio;

    @GetMapping("")
    public Collection<Persona> obtenerTodas() {
        return servicio.obtenerTodas();
    }

    @GetMapping("{documento}")
    public ResponseEntity<Persona> obtenerUna(@PathVariable int documento) {
        Persona encontrada = servicio.buscar(documento);
        System.out.println(encontrada);
        if (encontrada != null)
            return ResponseEntity.ok(encontrada);
        else
            return ResponseEntity.notFound().build();
    }

    @DeleteMapping("{documento}")
    public ResponseEntity<Persona> borrarUna(@PathVariable int documento) {
        if (servicio.existe(documento)) {
            return ResponseEntity.ok(servicio.borrar(documento));
        }
        else
            return ResponseEntity.notFound().build();
    }


    @PutMapping("{documento}")
    public ResponseEntity guardar(@PathVariable int documento, @RequestBody Persona nueva) {
        if (nueva.getNombre() == null || nueva.getApellido() == null || nueva.getNombre().isBlank() || nueva.getApellido().isBlank() || nueva.getEdad() < 0 || nueva.getEdad() > 120) {
            String mensaje = "Datos no válidos: ";
            if (nueva.getNombre() == null || nueva.getNombre().isBlank()) mensaje += "- El nombre es obligatorio";
            if (nueva.getApellido() == null || nueva.getApellido().isBlank()) mensaje += "- El apellido es obligatorio";
            if (nueva.getEdad() < 0 || nueva.getEdad() > 120) mensaje += "La edad debe estar entre 0 y 120";

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, mensaje);
        }

        nueva.setDocumento(documento);
        if (servicio.guardar(nueva)) // metodo guardar de la clase PersonasService
            return ResponseEntity.created(URI.create("/personas/" + documento)).build();
        else
            return ResponseEntity.ok().build();

    }
}

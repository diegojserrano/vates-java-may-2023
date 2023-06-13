package ar.com.vates.clase1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class NumerosController {

    private Set<Integer> conjunto = new Random()
            .ints(20,1,100)
            .boxed().collect(Collectors.toCollection(TreeSet::new));


    @GetMapping("/numeros/todos")
    public Set<Integer> consultarTodos() {
        return conjunto;
    }

    @GetMapping("/numeros/{buscado}")
    public ResponseEntity buscar(@PathVariable int buscado) {
        // Devuelve:
        // 200 OK: si existe
        // 404 NOT FOUND: si no existe
        return (conjunto.contains(buscado))?
             ResponseEntity.ok().build():
             ResponseEntity.notFound().build();
    }

    @PutMapping("/numeros/{nuevo}")
    public ResponseEntity agregar(@PathVariable int nuevo) {
         return (conjunto.add(nuevo))?
                 ResponseEntity.created(null).build():
                 ResponseEntity.badRequest().build();

    }

    @DeleteMapping("/numeros/{buscado}")
    public ResponseEntity borrar(@PathVariable int buscado) {
        return (conjunto.remove(buscado))?
                ResponseEntity.ok().build():
                ResponseEntity.badRequest().build();}

    @GetMapping("/numeros/pares")
    public Stream<Integer> buscar() {
        return conjunto.stream().filter(x -> x % 2 == 0);
    }


    @GetMapping("/numeros/filtrados")
    public Stream<Integer> buscarRango(
            @RequestParam(defaultValue="0",required = false) int minimo,
            @RequestParam(defaultValue="100",required = false) int maximo) {


        return conjunto.stream().filter(x -> x >= minimo && x <= maximo);
    }

}

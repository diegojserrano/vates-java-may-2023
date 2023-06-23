package ar.com.vates.clase1;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PersonasService {

    @Autowired
    private PersonasRepository repo;
    public PersonasService() {
        //try {
        //    personas = Files.lines(new ClassPathResource("personas2.txt").getFile().toPath())
        //            .map(Persona::desdeString)
        //            //.peek(this::guardar)
        //            .collect(Collectors.toMap(Persona::getDocumento, Function.identity()));
        //} catch (IOException e) {
        //    personas = new HashMap<>();
        //}
    }
    public boolean guardar(Persona p) {
        repo.guardar(p);
        return true;
    }
    public boolean existe(int documento) {
        return buscar(documento) != null;
    }
    public Persona borrar(int documento) {
        Persona encontrada = buscar(documento);
        if (encontrada != null)
            repo.borrar(documento);
        return encontrada;
    }
    public Persona buscar(int documento) {
        return repo.consultar(documento);
    }
    public Collection<Persona> obtenerTodas() {
        return repo.consultarTodas();
    }

    public int cantidad() {
        return repo.cantidad(); //personas.size();
    }

    public double promedioEdades() {
        return repo.promedioEdades();
    }

    public Map<String, Long> contarPorInicialApellido() {
        return repo.contarPorInicialApellido();
    }
}

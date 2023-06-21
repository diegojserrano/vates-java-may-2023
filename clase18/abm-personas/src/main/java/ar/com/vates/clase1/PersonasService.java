package ar.com.vates.clase1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
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

    private Map<Integer, Persona> personas;

    @PersistenceContext
    private EntityManager em;

    public PersonasService() {
        try {
            personas = Files.lines(new ClassPathResource("personas2.txt").getFile().toPath())
                    .map(Persona::desdeString)
                    //.peek(this::guardar)
                    .collect(Collectors.toMap(Persona::getDocumento, Function.identity()));
        } catch (IOException e) {
            personas = new HashMap<>();
        }
    }

    @Transactional
    public  boolean guardar(Persona p) {
        em.persist(p);
        return true; // personas.put(p.getDocumento(), p) == null;
    }

    @Transactional
    public boolean existe(int documento) {
        return personas.containsKey(documento);
    }

    public Persona borrar(int documento) {
        return personas.remove(documento);
    }

    public Persona buscar(int documento) {
        return personas.get(documento);
    }

    public Collection<Persona> obtenerTodas() {
        return em.createQuery("select p from Persona p", Persona.class).getResultList();
        //return personas.values().stream().limit(10).collect(Collectors.toList());
    }

    public int cantidad() {
        return personas.size();
    }

    public double promedioEdades() {
        return personas.values().stream().mapToInt(Persona::getEdad).average().orElse(0);
    }

    public Map<String, Long> contarPorInicialApellido() {
        return personas.values().stream().collect(Collectors.groupingBy(p -> p.getApellido().substring(0,1), Collectors.counting()));
    }
}

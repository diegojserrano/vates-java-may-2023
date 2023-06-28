package ar.com.vates.clase1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface PersonasRepository2 extends JpaRepository<Persona, Integer> {

    Collection<Persona> getPersonaByOrderByApellidoAscNombreAsc();
    Collection<Persona> getPersonasByApellidoEqualsIgnoreCaseOrderByNombreAsc(String filtro);

    @Query("select avg(p.edad) from Persona p")
    double promedioEdades();
}
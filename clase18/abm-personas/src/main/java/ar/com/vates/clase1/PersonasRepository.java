package ar.com.vates.clase1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class PersonasRepository {
    // Sólo hace CRUD
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void guardar(Persona p) {
        //em.persist(p);
        em.merge(p);
    }

    public Persona consultar(int documento) {
        return em.find(Persona.class, documento);
    }

    public Collection<Persona> consultarTodas() {
        return em.createQuery("select p from Persona p", Persona.class).getResultList();
    }

    @Transactional
    public void borrar(int documento) {
        Persona aBorrar = consultar(documento);
        em.remove(aBorrar);
    }


    public double promedioEdades() {
        return (Double) em.createQuery("select avg(p.edad) from Persona p").getSingleResult();
    }

    public int cantidad() {
        //em.createQuery("select count(p) from Persona p").getResultStream().forEach(x -> System.out.println(x.getClass().getName() + ": " + x.toString()));
        long cantidad = (Long) em.createQuery("select count(p) from Persona p").getSingleResult();
        return (int) cantidad;

        //return (int)em.createQuery("select p from Persona p", Persona.class).
        //        getResultStream().count();
    }

    public Map<String, Long> contarPorInicialApellido() {

        Map<String, Long> resultado = new HashMap<>();
        //Object [] res = (Object [])
               /* em.createQuery("select substring(p.nombre,1,1), count(p) cantidad from Persona p group by substring(p.nombre,1,1)")
                .getResultStream().forEach(x -> {
                        Object[]valores = (Object[])x;
                        resultado.put((String)valores[0],(Long) valores[1]);
                }
                ); */
        //resultado = em.createQuery("select new ar.com.vates.clase1.ConteoString(substring(p.nombre,1,1), count(p)) cantidad from Persona p group by substring(p.nombre,1,1)", ConteoString.class)
        //        .getResultStream()
        //        .collect(Collectors.toMap(ConteoString::getValor,ConteoString::getCantidad));
        resultado = em.createQuery("select new ar.com.vates.clase1.ConteoString(p.apellido, count(p)) cantidad from Persona p group by p.apellido", ConteoString.class)
                .getResultStream()
                .collect(Collectors.toMap(ConteoString::getValor,ConteoString::getCantidad));
        return resultado;
    }
}

package ar.com.vates.clase1;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name="telefonos")
public class Telefono {

    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @ManyToOne()
    @JoinColumn(name = "documento")
    @JsonBackReference
    private Persona persona;

    @Column(name="numero")
    private String numero;

    @Column(name="tipo")
    private int tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Telefono() {
    }

    public Telefono(int id, String numero, int tipo) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("%d - %s - %d", id, numero, tipo);
    }
}

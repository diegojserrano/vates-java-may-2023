package ar.com.vates.clase1;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.stream.Collectors;

@Entity @Table(name = "personas") // Nombre de la tabla en la base de datos
public class Persona {

    @Column(name="documento")
    @Id
    private int documento;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="edad")
    private int edad;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    @JsonManagedReference
    // joinColumn lleva el nombre de la clave foranea
    // mappedBy debe ser un nombre de ATRIBUTO de la clase Telefono, no es una columna
    private Collection<Telefono> telefonos;


    public Persona(int documento, String nombre, String apellido, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona() {
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Collection<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Collection<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    @Override
    public String toString() {
        return String.format("%d - %s %s - %d - (%s)", documento, nombre, apellido, edad, telefonos.stream().map(Telefono::toString).collect(Collectors.joining()));
    }

    public static Persona desdeString(String linea) {
        String []datos = linea.split(";");
        int documento = Integer.parseInt(datos[0]);
        String nombre = datos[1];
        String apellido = datos[2];
        int edad = Integer.parseInt(datos[3]);
        return new Persona(documento, nombre, apellido, edad);
    }
}

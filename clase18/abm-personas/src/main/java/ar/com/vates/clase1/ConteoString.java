package ar.com.vates.clase1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ConteoString {
    @Id
    private String valor;
    private Long cantidad;

    public ConteoString(String valor, Long cantidad) {
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public String getValor() {
        return valor;
    }

    public Long getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return valor + ": " + cantidad;
    }
}

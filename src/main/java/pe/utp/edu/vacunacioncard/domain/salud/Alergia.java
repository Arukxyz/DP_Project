package pe.utp.edu.vacunacioncard.domain.salud;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alergia {
    private String id;
    private String nombre;
    private String tipo;
    private String severidad;
    private String sintomas;
    private String tratamientoRecomendado;

    public Alergia(String nombre, String tipo, String severidad) {
        this.id = java.util.UUID.randomUUID().toString();
        this.nombre = nombre;
        this.tipo = tipo;
        this.severidad = severidad;
    }
}

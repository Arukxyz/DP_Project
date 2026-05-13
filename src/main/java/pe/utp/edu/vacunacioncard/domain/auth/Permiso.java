package pe.utp.edu.vacunacioncard.domain.auth;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Permiso {
    private String id;
    private String codigo;
    private String nombre;
    private String descripcion;

    public Permiso(String codigo, String nombre, String descripcion) {
        this.id = java.util.UUID.randomUUID().toString();
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}

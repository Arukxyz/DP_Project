package pe.utp.edu.vacunacioncard.domain.auth;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rol {
private String id;
    private String nombre;
    private String descripcion;
    private List<Permiso> permisos;

    public Rol(String nombre, String descripcion) {
        this.id = java.util.UUID.randomUUID().toString();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.permisos = new ArrayList<>();
    }
}

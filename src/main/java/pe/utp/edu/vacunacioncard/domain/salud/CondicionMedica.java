package pe.utp.edu.vacunacioncard.domain.salud;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CondicionMedica {
    private String id;
    private String nombre;
    private String codigoCIE10;
    private String descripcion;
    private String tratamiento;
    private boolean activa;

    public CondicionMedica(String nombre, String codigoCIE10) {
        this.id = java.util.UUID.randomUUID().toString();
        this.nombre = nombre;
        this.codigoCIE10 = codigoCIE10;
        this.activa = true;
    }
}

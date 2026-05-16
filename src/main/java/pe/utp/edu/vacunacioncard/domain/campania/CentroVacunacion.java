package pe.utp.edu.vacunacioncard.domain.campania;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.utp.edu.vacunacioncard.domain.comun.Contacto;
import pe.utp.edu.vacunacioncard.domain.comun.Direccion;

@Getter
@Setter
@NoArgsConstructor
public class CentroVacunacion {
    private String id;
    private String nombre;
    private Direccion direccion;
    private Contacto contacto;
    private int capacidadDiaria;
    private int personalDisponible;
    private String horarioAtencion;
    private boolean activo;

    public CentroVacunacion(String nombre, Direccion direccion, int capacidadDiaria) {
        this.id = java.util.UUID.randomUUID().toString();
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidadDiaria = capacidadDiaria;
        this.activo = true;
    }
}

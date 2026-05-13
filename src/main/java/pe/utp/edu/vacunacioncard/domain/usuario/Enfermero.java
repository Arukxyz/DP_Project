package pe.utp.edu.vacunacioncard.domain.usuario;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enfermero extends Usuario{
    private String colegiatura;
    private String especialidad;
    private String centroTrabajo;

    public Enfermero(String nombreCompleto, String dni, LocalDate fechaNacimiento, String colegiatura) {
        super(nombreCompleto, dni, fechaNacimiento);
        this.colegiatura = colegiatura;
    }
}

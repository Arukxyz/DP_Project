package pe.utp.edu.vacunacioncard.domain.cita;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import pe.utp.edu.vacunacioncard.domain.usuario.Paciente;
import pe.utp.edu.vacunacioncard.domain.vacunacion.Vacuna;

@Getter
@Setter
public class CitaVacunacion {
    private String id;
    private Paciente paciente;
    private Vacuna vacuna;
    private LocalDateTime fechaHora;
    private String centroVacunacion;
    private String ubicacion;
    private EstadoCita estado;
    private String observaciones;

    public CitaVacunacion(Paciente paciente, Vacuna vacuna, LocalDateTime fechaHora, String centroVacunacion) {
        this.id = java.util.UUID.randomUUID().toString();
        this.paciente = paciente;
        this.vacuna = vacuna;
        this.fechaHora = fechaHora;
        this.centroVacunacion = centroVacunacion;
        this.estado = new EstadoProgramada();
    }
}

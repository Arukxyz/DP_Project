package pe.utp.edu.vacunacioncard.domain.cita;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Horario {
     private String id;
    private String diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private int capacidadPorIntervalo;
    private List<String> intervalosDisponibles;

    public Horario(String diaSemana, LocalTime horaInicio, LocalTime horaFin, int capacidadPorIntervalo) {
        this.id = java.util.UUID.randomUUID().toString();
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.capacidadPorIntervalo = capacidadPorIntervalo;
        this.intervalosDisponibles = new ArrayList<>();
    }

}

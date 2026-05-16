package pe.utp.edu.vacunacioncard.domain.vacunacion;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.utp.edu.vacunacioncard.domain.usuario.Enfermero;

@Getter
@Setter
@NoArgsConstructor
public class RegistroVacuna {
    private String id;
    private Vacuna vacuna;
    private int numeroDosis;
    private LocalDateTime fechaAplicacion;
    private Enfermero enfermeroAplicador;
    private String lote;
    private String lugarAplicacion;
    private String estado;
    private String reaccionesAdversas;
    private LocalDateTime proximaDosis;

    public RegistroVacuna(Vacuna vacuna, int numeroDosis, Enfermero enfermeroAplicador, String lote) {
        this.id = java.util.UUID.randomUUID().toString();
        this.vacuna = vacuna;
        this.numeroDosis = numeroDosis;
        this.enfermeroAplicador = enfermeroAplicador;
        this.lote = lote;
        this.fechaAplicacion = LocalDateTime.now();
        this.estado = "APLICADA";
    }
}

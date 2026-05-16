package pe.utp.edu.vacunacioncard.domain.usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.utp.edu.vacunacioncard.domain.salud.Alergia;
import pe.utp.edu.vacunacioncard.domain.salud.CondicionMedica;
import pe.utp.edu.vacunacioncard.domain.salud.Contraindicacion;

@Getter
@Setter
@NoArgsConstructor
public class Paciente extends Usuario{
    private String historiaClinicaId;
    private String grupoSanguineo;
    private List<Alergia> alergias;
    private List<CondicionMedica> condicionesMedicas;
    private List<Contraindicacion> contraindicaciones;
    private String seguroMedico;
    private String contactoEmergencia;

    public Paciente(String nombreCompleto, String dni, LocalDate fechaNacimiento) {
        super(nombreCompleto, dni, fechaNacimiento);
        this.alergias = new ArrayList<>();
        this.condicionesMedicas = new ArrayList<>();
        this.contraindicaciones = new ArrayList<>();
    }
}

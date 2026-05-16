package pe.utp.edu.vacunacioncard.domain.usuario;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Administrador extends Usuario{
    private String nivelAcceso;
    private String area;

    
    public Administrador(String nombreCompleto, String dni, LocalDate fechaNacimiento) {
        super(nombreCompleto, dni, fechaNacimiento);
        this.nivelAcceso = "TOTAL";
    }
}

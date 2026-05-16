package pe.utp.edu.vacunacioncard.domain.usuario;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.utp.edu.vacunacioncard.domain.comun.Contacto;
import pe.utp.edu.vacunacioncard.domain.comun.Direccion;

@Getter
@Setter
@NoArgsConstructor
public abstract class Usuario {
    protected String id;
    protected String nombreCompleto;
    protected String dni;
    protected LocalDate fechaNacimiento;
    protected Contacto contacto;
    protected Direccion direccion;
    protected boolean activo;

    public Usuario(String nombreCompleto, String dni, LocalDate fechaNacimiento){
        this.id = UUID.randomUUID().toString();
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.activo = true;
    }

}

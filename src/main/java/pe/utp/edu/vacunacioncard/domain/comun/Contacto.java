package pe.utp.edu.vacunacioncard.domain.comun;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contacto {
    private String email;
    private String telefono;
    private String telefonoAlternativo;

    public Contacto(String email, String telefono){
        this.email = email;
        this.telefono = telefono;
    }
}

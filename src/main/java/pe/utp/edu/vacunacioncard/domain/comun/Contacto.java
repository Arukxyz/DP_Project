package pe.utp.edu.vacunacioncard.domain.comun;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contacto {
    private String email;
    private String telefono;
    private String telefonoAlternativo;

    public Contacto(String email, String telefono){
        this.email = email;
        this.telefono = telefono;
    }
}

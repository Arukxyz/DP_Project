package pe.utp.edu.vacunacioncard.domain.comun;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
    private String calle;
    private String numero;
    private String departamento;
    private String distrito;
    private String provincia;
    private String codigoPostal;
}

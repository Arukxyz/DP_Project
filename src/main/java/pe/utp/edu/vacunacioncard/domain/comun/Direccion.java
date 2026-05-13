package pe.utp.edu.vacunacioncard.domain.comun;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Direccion {
    private String calle;
    private String numero;
    private String departamento;
    private String distrito;
    private String provincia;
    private String codigoPostal;

    public Direccion (String calle, String numero, String departamento, String provincia, String distrito, String codigoPostal){
        this.calle = calle;
        this.numero = numero;
        this.departamento = departamento;
        this.distrito = distrito;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
    }
}

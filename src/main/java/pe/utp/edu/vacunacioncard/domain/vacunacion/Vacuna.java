package pe.utp.edu.vacunacioncard.domain.vacunacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vacuna {
     private String id;
    private String nombre;
    private String laboratorio;
    private String paisOrigen;
    private int dosisRequeridas;
    private int intervaloDias;
    private String viaAdministracion;
    private String temperaturaAlmacenamiento;
    private boolean disponible;
    private List<String> efectosSecundarios;
    private String contraindicaciones;
    private LocalDate fechaVencimiento;

    public Vacuna(String nombre, String laboratorio, int dosisRequeridas) {
        this.id = java.util.UUID.randomUUID().toString();
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.dosisRequeridas = dosisRequeridas;
        this.disponible = true;
        this.efectosSecundarios = new ArrayList<>();
    }
}

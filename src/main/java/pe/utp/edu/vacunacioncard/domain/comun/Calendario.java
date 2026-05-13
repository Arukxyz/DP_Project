package pe.utp.edu.vacunacioncard.domain.comun;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calendario {
    private Map<LocalDate, Boolean> diasHabiles;
    private Map<LocalDate, String> feriados;

    public Calendario() {
        this.diasHabiles = new HashMap<>();
        this.feriados = new HashMap<>();
    }
}

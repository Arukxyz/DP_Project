package pe.utp.edu.vacunacioncard.domain.cita;

public interface EstadoCita {
    String getNombre();
    boolean puedeCancelarse();
    boolean puedeReagendarse();
}

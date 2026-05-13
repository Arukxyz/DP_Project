package pe.utp.edu.vacunacioncard.domain.cita;

public class EstadoCancelada implements EstadoCita{

    @Override
    public String getNombre() {
        return "CANCELADA";
    }

    @Override
    public boolean puedeReagendarse() {
        return false;
    }

    @Override
    public boolean puedeCancelarse() {
        return false;
    }

}

package pe.utp.edu.vacunacioncard.domain.cita;

public class EstadoProgramada implements EstadoCita{

    @Override
    public String getNombre() {
    return "PROGRAMADA";
    }

    @Override
    public boolean puedeCancelarse() {
        return true;
    }

    @Override
    public boolean puedeReagendarse() {
        return true;
    }

}

package pe.utp.edu.vacunacioncard.domain.cita;

public class EstadoAplicada implements EstadoCita{

    @Override
    public String getNombre() {
        return "APLICADA";
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

package pe.utp.edu.vacunacioncard.domain.notificacion;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.utp.edu.vacunacioncard.domain.usuario.Usuario;

@Getter
@Setter
@NoArgsConstructor
public class NotificacionSistema extends Notificacion{
    private String tipo;
    private boolean leida;

    public NotificacionSistema(Usuario destinatario, String mensaje, String tipo) {
        super(destinatario, mensaje);
        this.tipo = tipo;
        this.leida = false;
    }
}

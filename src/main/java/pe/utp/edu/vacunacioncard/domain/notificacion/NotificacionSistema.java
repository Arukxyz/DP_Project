package pe.utp.edu.vacunacioncard.domain.notificacion;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.utp.edu.vacunacioncard.domain.usuario.Usuario;

@Getter
@Setter
@NoArgsConstructor
public class NotificacionSistema implements Notificacion{
    private String id;
    private Usuario destinatario;
    private String mensaje;
    private String tipo;
    private LocalDateTime fechaEnvio;
    private String estado;
    private boolean leida;

    public NotificacionSistema(Usuario destinatario, String mensaje, String tipo) {
        this.id = java.util.UUID.randomUUID().toString();
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.tipo = tipo;
        this.estado = "PENDIENTE";
        this.leida = false;
    }
}

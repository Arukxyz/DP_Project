package pe.utp.edu.vacunacioncard.domain.notificacion;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.utp.edu.vacunacioncard.domain.usuario.Usuario;

@Getter
@Setter
@NoArgsConstructor
public abstract class Notificacion {
   // Atributos comunes heredados por las subclases
    private String id;
    private String mensaje;
    private Usuario destinatario;
    private LocalDateTime fechaEnvio;
    private String estado;

    // Constructor base para inicializar la lógica común
    public Notificacion(Usuario destinatario, String mensaje) {
        this.id = java.util.UUID.randomUUID().toString();
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.estado = "PENDIENTE";
    }
}

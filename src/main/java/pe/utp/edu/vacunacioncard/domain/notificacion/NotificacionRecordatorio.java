package pe.utp.edu.vacunacioncard.domain.notificacion;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.utp.edu.vacunacioncard.domain.usuario.Usuario;
import pe.utp.edu.vacunacioncard.domain.vacunacion.RegistroVacuna;

@Getter
@Setter
@NoArgsConstructor
public class NotificacionRecordatorio implements Notificacion {
    private String id;
    private Usuario destinatario;
    private String mensaje;
    private RegistroVacuna registroVacuna;
    private LocalDateTime fechaEnvio;
    private String estado;
    private LocalDateTime fechaRecordatorio;

    public NotificacionRecordatorio(Usuario destinatario, RegistroVacuna registroVacuna, LocalDateTime fechaRecordatorio) {
        this.id = java.util.UUID.randomUUID().toString();
        this.destinatario = destinatario;
        this.registroVacuna = registroVacuna;
        this.fechaRecordatorio = fechaRecordatorio;
        this.estado = "PENDIENTE";
    }
}

package pe.utp.edu.vacunacioncard.domain.notificacion;

import java.time.LocalDateTime;

import pe.utp.edu.vacunacioncard.domain.usuario.Usuario;

public interface Notificacion {
    String getId();
    String getMensaje();
    Usuario getDestinatario();
    LocalDateTime getFechaEnvio();
    String getEstado();
    
    // Setters
    void setId(String id);
    void setMensaje(String mensaje);
    void setDestinatario(Usuario destinatario);
    void setFechaEnvio(LocalDateTime fechaEnvio);
    void setEstado(String estado);
}

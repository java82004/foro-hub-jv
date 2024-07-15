package com.api.foro_hub.domain.respuesta;

import com.api.foro_hub.domain.topico.Topico;
import com.api.foro_hub.domain.usuario.Usuario;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record NuevaRespuesta(
        @NotNull
        String mensaje,
        Topico topico,
        LocalDateTime fechaCreacion,
        Usuario usuario,
        String solucion
) {
}

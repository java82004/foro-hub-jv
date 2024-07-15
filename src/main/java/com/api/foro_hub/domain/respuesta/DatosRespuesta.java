package com.api.foro_hub.domain.respuesta;

import java.time.LocalDateTime;

public record DatosRespuesta(
        Long id,
        String mensaje,
        LocalDateTime fechaCreacion
) {
}

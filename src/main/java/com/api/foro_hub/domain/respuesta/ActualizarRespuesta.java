package com.api.foro_hub.domain.respuesta;

import jakarta.validation.constraints.NotNull;

public record ActualizarRespuesta(
        @NotNull Long id,
        String mensaje,
        String solucion
) {
}

package com.api.foro_hub.domain.topico;

import jakarta.validation.constraints.NotNull;

public record ActualizarTopico(
        @NotNull Long id,
        String titulo,
        String mensaje,
        String status
) {
}

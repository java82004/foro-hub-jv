package com.api.foro_hub.domain.curso;

import jakarta.validation.constraints.NotNull;

public record NuevoCurso(
        @NotNull
        String nombre,
        @NotNull
        String categoria
) {
}
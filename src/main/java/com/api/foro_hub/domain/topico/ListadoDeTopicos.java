package com.api.foro_hub.domain.topico;

import java.time.LocalDateTime;

public record ListadoDeTopicos(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        Long autorId,
        Long cursoId,
        String cursoNombre
) {

    public ListadoDeTopicos(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getAutor().getId(),
                topico.getCurso().getId(),
                topico.getCurso().getNombre());
    }
}

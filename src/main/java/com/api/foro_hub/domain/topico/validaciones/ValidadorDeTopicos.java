package com.api.foro_hub.domain.topico.validaciones;

import com.api.foro_hub.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorDeTopicos {

    @Autowired
    private TopicoRepository topicoRepository;

    public void validarTituloYMensajeUnicos(String titulo, String mensaje) {
        if (topicoRepository.existsByTituloAndMensaje(titulo, mensaje)) {
            throw new IllegalArgumentException("Tópico con el mismo título y mensaje ya existe");
        }
    }
}

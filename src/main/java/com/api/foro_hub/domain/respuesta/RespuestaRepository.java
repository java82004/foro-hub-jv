package com.api.foro_hub.domain.respuesta;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    //Page<Respuesta> findAll(Pageable paginacion);
    Page<Respuesta> findBySolucionTrue(Pageable paginacion);
}

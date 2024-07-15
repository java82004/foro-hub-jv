package com.api.foro_hub.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    Page<Topico> findAll(Pageable paginacion);

    Page<Topico> findAllByStatusTrue(Pageable paginacion);

    @Query("SELECT t FROM Topico t WHERE t.status = true AND t.curso.nombre = :cursoNombre AND YEAR(t.fechaCreacion) = :year ORDER BY t.fechaCreacion ASC")
    Page<Topico> findByCursoNombreAndYear(String cursoNombre, int year, Pageable paginacion);

    boolean existsByTituloAndMensaje(String titulo, String mensaje);
}

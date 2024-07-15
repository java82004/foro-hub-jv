package com.api.foro_hub.domain.curso;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cursos")
@Entity(name = "Curso")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String categoria;
    private Boolean status;

    public Curso(NuevoCurso nuevoCurso) {
        this.nombre = nuevoCurso.nombre();
        this.categoria = nuevoCurso.categoria();
        this.status = true;  // Inicializa el status como activo
    }

    public void actualizarCurso(ActualizarCurso actualizarCurso) {
        if (actualizarCurso.nombre() != null) {
            this.nombre = actualizarCurso.nombre();
        }
        if (actualizarCurso.categoria() != null) {
            this.categoria = actualizarCurso.categoria();
        }
    }

    public void desactivarCurso() {
        this.status = false;
    }
}

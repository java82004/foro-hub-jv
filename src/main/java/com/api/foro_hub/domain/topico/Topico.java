package com.api.foro_hub.domain.topico;

import com.api.foro_hub.domain.curso.Curso;
import com.api.foro_hub.domain.respuesta.Respuesta;
import com.api.foro_hub.domain.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Table(name = "topicos", uniqueConstraints = {@UniqueConstraint(columnNames = {"titulo", "mensaje"})})
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;
    @NotBlank
    private String mensaje;

    @Column(name = "fecha_Creacion")
    private LocalDateTime fechaCreacion;

    private Boolean status;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="autor_id", referencedColumnName="id")
    private Usuario autor;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id", referencedColumnName = "id")
    private Curso curso;

    @OneToMany(mappedBy = "topico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Respuesta> respuestas;

    public Topico(String titulo, String mensaje, Usuario autor, Curso curso) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fechaCreacion = LocalDateTime.now();
        this.status = true;
        this.autor = autor;
        this.curso = curso;
    }

    public void desactivarTopico() {
        this.status = false;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}

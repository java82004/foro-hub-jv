CREATE TABLE respuestas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    mensaje VARCHAR(255) NOT NULL,
    fecha_Creacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    solucion BOOLEAN NOT NULL DEFAULT FALSE,
    topico_id BIGINT,
    autor_id BIGINT,
    FOREIGN KEY (topico_id) REFERENCES topicos(id),
    FOREIGN KEY (autor_id) REFERENCES usuarios(id)
);
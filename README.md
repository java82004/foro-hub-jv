# foro-hub-jv

# ForoHub

ForoHub es una aplicación web desarrollada en Java utilizando Spring Boot que permite a los usuarios participar en discusiones sobre diversos temas.

## Tecnologías utilizadas

- Java (versión 17 en adelante)
- Maven (Initializr utiliza la versión 4)
- Proyecto en formato JAR
- Spring Boot DevTools
- Spring Web
- Spring Data JPA
- Spring Validation
- Flyway Migration
- MySQL Driver
- Lombok
- Spring Security
- SpringDoc-openapi
- java-jwt
- Insomnia (para pruebas de API)

## Estructura del proyecto

El proyecto se organiza de la siguiente manera:

- **Entidades JPA**: Representan las tablas de la base de datos.
- **Repositorios**: Interfaces que extienden JpaRepository para el acceso a datos.
- **Servicios**: Contienen la lógica de negocio.
- **Controladores**: Gestionan las solicitudes HTTP y respuestas.
- **DTOs**: Objetos de transferencia de datos para manejar la entrada y salida de datos.

## Configuración del proyecto

### Dependencias

Asegúrate de tener las siguientes dependencias en tu archivo `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>
    <dependency>
        <groupId>org.flywaydb</groupId>
        <artifactId>flyway-core</artifactId>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
## Configuración de la base de datos

En el archivo application.properties, configura la conexión a tu base de datos MySQL:

```
spring.datasource.url=jdbc:mysql://localhost:8080/forohub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=true

# Configuración de Flyway
spring.flyway.locations=classpath:db/migration
```
## Instalación

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/api-forohub.git
   cd api-forohub

1. **Configurar la base de datos**:

- **El proyecto está configurado para usar una base de datos H2 en memoria para desarrollo.**
- **Puedes cambiar la configuración en el archivo `src/main/resources/application.properties` si prefieres usar otra base de datos.**

3. **Compilar y ejecutar la aplicación**:
```bash
mvn clean install
mvn spring-boot:run
```

4. **Acceder a la documentación de la API**:
- **La documentación interactiva de la API estará disponible en: `http://localhost:8080/swagger-ui.html`**

## Uso

### Endpoints de Tópicos

- **Registrar un nuevo tópico**:
  ```http
  POST /topicos
  Contenido-Tipo: application/json

  {
    "titulo": "Título del tópico",
    "mensaje": "Mensaje del tópico",
    "autorId": "1",
    "cursoId": "1"
  }

- **Listar todos los tópicos activos**:

```http
GET /topicos
```

- **Actualizar un tópico**:

```http
PUT /topicos
Contenido-Tipo: application/json

{
  "id": "1",
  "titulo": "Título actualizado",
  "mensaje": "Mensaje actualizado"
}
```

- **Eliminar un tópico (borrado lógico)**:

```http
DELETE /topicos/{id}
```

- **Filtrar tópicos por nombre de curso y año**:

```http
GET /topicos/filtrar?cursoNombre=Java&year=2024
```

### Endpoints de Cursos

- **Registrar un nuevo curso**:

```http
POST /cursos
Contenido-Tipo: application/json

{
  "nombre": "Nombre del curso",
  "categoria": "Categoría del curso"
}
```
- **Listar todos los cursos**:

```http
GET /cursos
```

- **Actualizar un curso**:

```http
PUT /cursos
Contenido-Tipo: application/json

{
  "id": "1",
  "nombre": "Nombre del curso actualizado",
  "categoria": "Categoría del curso actualizada"
}
```

- **Eliminar un curso (borrado lógico)**:

```http
DELETE /cursos/{id}
```

## Capturas de Pantalla

### Registro de Tópico

![Insomnia](https://github.com/user-attachments/assets/abc489ce-d1bb-463f-a0ed-d0e8dff9a530)

### swagger-ui

![swagger-ui](https://github.com/user-attachments/assets/9c594f49-a526-4259-b2c0-47709d74c023)

## Contribuir

¡Las contribuciones son bienvenidas! Si deseas contribuir, por favor sigue estos pasos:

1.	Haz un fork del repositorio.
2.	Crea una nueva rama (git checkout -b feature-nueva-funcionalidad).
3.	Realiza tus cambios y commitea (git commit -am 'Agregar nueva funcionalidad').
4.	Haz push a la rama (git push origin feature-nueva-funcionalidad).
5.	Abre un Pull Request para revisión.

¡Gracias por tomarte el tiempo de revisar Librería Alura!


Asegúrate de reemplazar `"tu-usuario"` y `"tu-contrasena"` con tus propios datos y credenciales. Además, puedes actualizar cualquier otra información que sea específica para tu proyecto.

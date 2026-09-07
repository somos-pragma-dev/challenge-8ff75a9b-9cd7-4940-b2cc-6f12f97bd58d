# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Contexto técnico original
Herencia, polimorfismo y encapsulacion en un sistema academico

### Reto
- Tema: Programacion Orientada a Objetos con Java
- Seniority: junior-l1
- Tipo: practical
- Título: Implementación de conceptos OOP en un sistema académico
- Tiempo estimado: 4 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Definición de la jerarquía de clases — objetivo: Establecer la estructura básica de clases que representen los diferentes tipos de usuarios en el sistema académico. — entregable (NO resolver): Diagrama de clases que muestre la jerarquía de herencia y los atributos y métodos de cada clase.
- Fase 2: Implementación de la lógica de negocio — objetivo: Implementar la lógica de negocio para la creación, modificación y eliminación de usuarios, así como la realización de acciones específicas para cada tipo de usuario. — entregable (NO resolver): Código fuente que implementa la lógica de negocio para la gestión de usuarios en el sistema académico.
- Fase 3: Pruebas y validación — objetivo: Realizar pruebas unitarias para validar el funcionamiento correcto de la implementación. — entregable (NO resolver): Conjunto de pruebas unitarias que validan el funcionamiento correcto de la implementación.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:
// === ARCHIVO: src/main/java/com/pragma/academic/domain/model/User.java ===
package com.pragma.academic.domain.model;

public abstract class User {
    private String id;
    private String name;
    private String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public abstract void performRoleSpecificAction();
}

// === ARCHIVO: src/main/java/com/pragma/academic/domain/model/Student.java ===
package com.pragma.academic.domain.model;

public class Student extends User {
    private String studentId;

    public Student(String id, String name, String email, String studentId) {
        super(id, name, email);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public void performRoleSpecificAction() {
        System.out.println("Estudiante realizando acción específica");
    }
}

// === ARCHIVO: src/main/java/com/pragma/academic/domain/model/Professor.java ===
package com.pragma.academic.domain.model;

public class Professor extends User {
    private String professorId;

    public Professor(String id, String name, String email, String professorId) {
        super(id, name, email);
        this.professorId = professorId;
    }

    public String getProfessorId() {
        return professorId;
    }

    @Override
    public void performRoleSpecificAction() {
        System.out.println("Profesor realizando acción específica");
    }
}

// === ARCHIVO: src/main/java/com/pragma/academic/domain/model/Admin.java ===
package com.pragma.academic.domain.model;

public class Admin extends User {
    private String adminId;

    public Admin(String id, String name, String email, String adminId) {
        super(id, name, email);
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }

    @Override
    public void performRoleSpecificAction() {
        System.out.println("Administrador realizando acción específica");
    }
}

// === ARCHIVO: src/main/java/com/pragma/academic/application/UserService.java ===
package com.pragma.academic.application;

import com.pragma.academic.domain.model.User;

public interface UserService {
    User createUser(String id, String name, String email, String role);
    User getUserById(String id);
    void updateUser(User user);
    void deleteUser(String id);
}

// === ARCHIVO: src/main/java/com/pragma/academic/application/UserServiceImpl.java ===
package com.pragma.academic.application;

import com.pragma.academic.domain.model.User;
import com.pragma.academic.domain.model.Student;
import com.pragma.academic.domain.model.Professor;
import com.pragma.academic.domain.model.Admin;
import com.pragma.academic.infrastructure.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(String id, String name, String email, String role) {
        User user = switch (role) {
            case "student" -> new Student(id, name, email, id);
            case "professor" -> new Professor(id, name, email, id);
            case "admin" -> new Admin(id, name, email, id);
            default -> throw new IllegalArgumentException("Rol no válido");
        };
        userRepository.saveUser(user);
        return user;
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userRepository.saveUser(user);
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteUser(id);
    }
}

// === ARCHIVO: src/main/java/com/pragma/academic/infrastructure/UserRepository.java ===
package com.pragma.academic.infrastructure;

import com.pragma.academic.domain.model.User;

public interface UserRepository {
    void saveUser(User user);
    User findUserById(String id);
    void deleteUser(String id);
}

// === ARCHIVO: src/main/java/com/pragma/academic/infrastructure/UserRepositoryImpl.java ===
package com.pragma.academic.infrastructure;

import com.pragma.academic.domain.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    private final Map<String, User> userMap = new HashMap<>();

    @Override
    public void saveUser(User user) {
        userMap.put(user.getId(), user);
    }

    @Override
    public User findUserById(String id) {
        return userMap.get(id);
    }

    @Override
    public void deleteUser(String id) {
        userMap.remove(id);
    }
}

// === ARCHIVO: src/test/java/com/pragma/academic/UserServiceTest.java ===
package com.pragma.academic;

import com.pragma.academic.application.UserService;
import com.pragma.academic.application.UserServiceImpl;
import com.pragma.academic.domain.model.User;
import com.pragma.academic.infrastructure.UserRepository;
import com.pragma.academic.infrastructure.UserRepositoryImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserServiceTest {
    private UserService userService;

    @BeforeEach
    public void setUp() {
        UserRepository userRepository = new UserRepositoryImpl();
        userService = new UserServiceImpl(userRepository);
    }

    @Test
    public void testCreateUser() {
        User user = userService.createUser("1", "John Doe", "john.doe@example.com", "student");
        assertNotNull(user);
        assertEquals("1", user.getId());
    }

    @Test
    public void testGetUserById() {
        userService.createUser("1", "John Doe", "john.doe@example.com", "student");
        User user = userService.getUserById("1");
        assertNotNull(user);
        assertEquals("John Doe", user.getName());
    }

    @Test
    public void testUpdateUser() {
        User user = userService.createUser("1", "John Doe", "john.doe@example.com", "student");
        user.setName("Jane Doe");
        userService.updateUser(user);
        User updatedUser = userService.getUserById("1");
        assertEquals("Jane Doe", updatedUser.getName());
    }

    @Test
    public void testDeleteUser() {
        userService.createUser("1", "John Doe", "john.doe@example.com", "student");
        userService.deleteUser("1");
        User user = userService.getUserById("1");
        assertEquals(null, user);
    }
}

// === ARCHIVO: src/main/resources/application.properties ===
spring.application.name=academic-system

// === ARCHIVO: src/main/java/com/pragma/academic/AcademicApplication.java ===
package com.pragma.academic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AcademicApplication {
    public static void main(String[] args) {
        SpringApplication.run(AcademicApplication.class, args);
    }
}

// === ARCHIVO: pom.xml ===
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.pragma</groupId>
    <artifactId>academic</artifactId>
    <version>1.0-SNAPSHOT</version>
    <name>academic</name>
    <description>Academic System</description>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.4.0</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <properties>
        <java.version>21</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```

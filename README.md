# Implementación de conceptos OOP en un sistema académico

En un sistema académico, debes implementar la herencia, polimorfismo y encapsulación para gestionar diferentes tipos de usuarios (estudiantes, profesores, administradores). Cada tipo de usuario tiene atributos y comportamientos específicos. El sistema debe permitir la creación, modificación y eliminación de usuarios, así como la realización de acciones específicas para cada tipo de usuario.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programacion Orientada a Objetos con Java |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición de la jerarquía de clases

**Objetivo:** Establecer la estructura básica de clases que representen los diferentes tipos de usuarios en el sistema académico.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los atributos y comportamientos comunes y específicos de cada tipo de usuario.
- Define una clase base que represente a un usuario genérico y clases derivadas para cada tipo de usuario específico.
- Aplica el principio de encapsulación para proteger los atributos de las clases.

**Entregable:** Diagrama de clases que muestre la jerarquía de herencia y los atributos y métodos de cada clase.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que la herencia permite reutilizar código y establecer relaciones entre clases.
- El polimorfismo te permitirá tratar objetos de clases derivadas como si fueran de la clase base.

</details>

### Fase 2: Implementación de la lógica de negocio

**Objetivo:** Implementar la lógica de negocio para la creación, modificación y eliminación de usuarios, así como la realización de acciones específicas para cada tipo de usuario.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Crea métodos en las clases para permitir la creación, modificación y eliminación de usuarios.
- Implementa métodos específicos para cada tipo de usuario que permitan realizar acciones relacionadas con su rol en el sistema académico.
- Aplica el polimorfismo para tratar objetos de clases derivadas como si fueran de la clase base.

**Entregable:** Código fuente que implementa la lógica de negocio para la gestión de usuarios en el sistema académico.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que el polimorfismo te permite tratar objetos de clases derivadas como si fueran de la clase base.
- Evalúa cómo aplicar los principios de herencia y encapsulación en la implementación de la lógica de negocio.

</details>

### Fase 3: Pruebas y validación

**Objetivo:** Realizar pruebas unitarias para validar el funcionamiento correcto de la implementación.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Crea pruebas unitarias para validar el funcionamiento correcto de los métodos implementados en las clases.
- Asegura que las pruebas cubran los casos de uso más comunes y los edge cases identificados en las fases anteriores.
- Evalúa el código implementado y realiza las mejoras necesarias para garantizar su calidad y mantenibilidad.

**Entregable:** Conjunto de pruebas unitarias que validan el funcionamiento correcto de la implementación.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que las pruebas unitarias son esenciales para garantizar la calidad y fiabilidad del código.
- Evalúa cómo mejorar el código implementado para garantizar su calidad y mantenibilidad.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son la herencia, el polimorfismo y la encapsulación en el contexto de la programación orientada a objetos?
- **paraQueSirve**: ¿Para qué sirven la herencia, el polimorfismo y la encapsulación en un sistema académico?
- **comoSeUsa**: ¿Cómo se aplican la herencia, el polimorfismo y la encapsulación en la implementación de un sistema académico?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar la herencia, el polimorfismo y la encapsulación en un sistema académico?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de la herencia, el polimorfismo y la encapsulación en un sistema académico?

## Criterios de Evaluacion

- Implementación correcta de la herencia en la jerarquía de clases.
- Aplicación efectiva del polimorfismo en la lógica de negocio.
- Uso adecuado de la encapsulación para proteger los atributos de las clases.
- Creación de pruebas unitarias que validan el funcionamiento correcto de la implementación.
- Evaluación y mejora del código implementado para garantizar su calidad y mantenibilidad.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*

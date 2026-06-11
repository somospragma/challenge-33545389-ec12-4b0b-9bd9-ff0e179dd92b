# Implementación de un sistema de procesamiento de eventos en tiempo real

El sistema debe procesar eventos en tiempo real provenientes de múltiples orígenes (sensores de seguridad, transacciones financieras, solicitudes de usuarios). Debe mantener la resiliencia, escalabilidad y confiabilidad del código. Los eventos tienen atributos como tipo, timestamp, origen y datos. El sistema debe filtrar eventos no deseados, agregar metadatos y persistir los eventos válidos en un repositorio. Debe manejar la consistencia de los datos y la idempotencia de las operaciones.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Reactiva |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

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

### Fase 1: Configuración del entorno y recepción de eventos

**Objetivo:** Configurar el entorno de desarrollo y recibir eventos de múltiples orígenes.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Configurar el entorno de desarrollo para recibir eventos de sensores de seguridad, transacciones financieras y solicitudes de usuarios.
- Implementar la recepción de eventos y asegurar que se manejen correctamente.

**Entregable:** Entorno de desarrollo configurado y capaz de recibir eventos de múltiples orígenes.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo modelar los eventos y sus atributos.
- Piensa en cómo asegurar que los eventos se reciban de manera eficiente y escalable.

</details>

### Fase 2: Filtrado y agregación de metadatos

**Objetivo:** Filtrar eventos no deseados y agregar metadatos a los eventos válidos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementar la lógica para filtrar eventos no deseados basándose en reglas definidas.
- Agregar metadatos a los eventos válidos para enriquecer la información.

**Entregable:** Lógica implementada para filtrar eventos no deseados y agregar metadatos a los eventos válidos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo definir y aplicar reglas de filtrado.
- Piensa en qué metadatos serían útiles para enriquecer los eventos.

</details>

### Fase 3: Persistencia de eventos y manejo de consistencia

**Objetivo:** Persistir eventos válidos en un repositorio y manejar la consistencia de los datos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementar la persistencia de eventos válidos en un repositorio.
- Asegurar la consistencia de los datos y manejar la idempotencia de las operaciones.

**Entregable:** Eventos válidos persistidos en un repositorio con consistencia de datos y manejo de idempotencia.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo asegurar la consistencia de los datos al persistir eventos.
- Piensa en cómo manejar la idempotencia de las operaciones para evitar duplicados.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la programación reactiva y cómo se aplica en este reto?
- **paraQueSirve**: ¿Para qué sirve filtrar eventos y agregar metadatos en este sistema?
- **comoSeUsa**: ¿Cómo se usa la programación reactiva para manejar flujos de eventos en tiempo real?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar un sistema de procesamiento de eventos en tiempo real?
- **queDecisionesImplica**: ¿Qué decisiones implica el manejo de la consistencia y la idempotencia en este sistema?

## Criterios de Evaluacion

- Configuración correcta del entorno de desarrollo para recibir eventos de múltiples orígenes.
- Implementación de la lógica para filtrar eventos no deseados y agregar metadatos a los eventos válidos.
- Persistencia de eventos válidos en un repositorio con consistencia de datos y manejo de idempotencia.

---

*Reto generado automaticamente por Challenge Generator - Pragma*

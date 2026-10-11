# Laboratorios de la sesión 1

Completa los TODO de las cinco clases en tu copia personal. Las plantillas compilan desde el inicio, pero no están resueltas: que un archivo compile no significa que el laboratorio esté completo.

Trabaja con IntelliJ IDEA y JDK 21 como referencia del curso; estas clases también son compatibles con JDK 17. Usa tipos explícitos, datos ficticios y nombres claros. No uses Scanner, if, ciclos, conversiones, métodos auxiliares ni dependencias externas en estas actividades.

## Método de trabajo

1. Lee el objetivo y predice la salida antes de ejecutar.
2. Completa un TODO a la vez y ejecuta la clase correspondiente.
3. Compara la salida con los requisitos y corrige diferencias.
4. Anota qué comprobaste y explica tus decisiones en comentarios o en tu README personal.

## Lab 1 · Mi primer saludo

**Archivo:** [Lab01MiPrimerSaludo.java](Lab01MiPrimerSaludo.java). **Modalidad:** clase. **Objetivo:** ejecutar un programa y producir tres líneas.

Completa los TODO para mostrar un saludo, un nombre ficticio y una meta. Ejemplo de formato:

```text
Hola, Java!
Nombre: Ana
Meta: Aprender a ejecutar y comprender un programa Java.
```

Puedes cambiar el nombre y la meta. Comprueba que hay exactamente tres líneas en ese orden. Ejecuta de nuevo cambiando solo la meta y verifica el resultado. Explica qué hace `main` y qué agrega `println` al final de cada salida.

## Lab 2 · Ordena la salida

**Archivo:** [Lab02OrdenaLaSalida.java](Lab02OrdenaLaSalida.java). **Modalidad:** clase. **Objetivo:** controlar los saltos de línea.

Antes de modificar el código, escribe tu predicción de la salida inicial. Ejecuta y compara. Después completa los TODO para producir exactamente:

```text
A - B - C
Fin del laboratorio
```

Usa al menos un `print` y un `println`. Comprueba espacios, guiones y saltos. Explica qué instrucciones terminan una línea y cuáles no.

## Lab 3 · Datos con sentido

**Archivo:** [Lab03DatosConSentido.java](Lab03DatosConSentido.java). **Modalidad:** clase. **Objetivo:** elegir tipos por el significado del dato.

Declara las variables `nombre`, `edad`, `temperatura`, `inicial` y `activo`. Justifica el tipo de cada una y muestra las etiquetas `Nombre`, `Edad`, `Temperatura`, `Inicial` y `Activo`, una por línea.

| Caso | Nombre | Edad | Temperatura | Inicial | Activo |
| --- | --- | --- | --- | --- | --- |
| A | Ana | 20 | 23.5 | A | true |
| B | Luis | 25 | 18.0 | L | false |

Para el caso A, la salida debe ser:

```text
Nombre: Ana
Edad: 20
Temperatura: 23.5
Inicial: A
Activo: true
```

Prueba el caso B cambiando solo los valores iniciales, sin modificar las instrucciones de salida. Registra ambos resultados. Explica por qué `String` no es un primitivo y por qué `char` usa comillas simples.

## Lab 4 · Diagnostica y corrige

**Archivo:** [Lab04DiagnosticaYCorrige.java](Lab04DiagnosticaYCorrige.java). **Modalidad:** casa o extensión en clase. **Objetivo:** usar los diagnósticos del compilador para corregir cuatro errores.

Los fragmentos incorrectos están comentados. Activa uno por vez en tu copia personal, intenta compilar, lee el diagnóstico y corrígelo antes de pasar al siguiente. No dejes errores activos al entregar.

| Caso | Requisito de la corrección |
| --- | --- |
| Texto con comillas incorrectas | Conservar Ana como String y mostrar `Nombre: Ana`. |
| Decimal asignado a int | Conservar 23.5 usando un tipo apropiado y mostrar `Temperatura: 23.5`. |
| Variable local sin inicializar | Dar a edad el valor 20 antes de leerla y mostrar `Edad: 20`. |
| Reasignación de final | Mantener CURSO como final con Java y mostrar `Curso: Java`; eliminar la reasignación. |

La clase corregida debe mostrar esas cuatro líneas en ese orden. Para cada caso, registra en tu README personal el mensaje observado, la causa y tu corrección. Los mensajes pueden variar según el IDE o compilador: se evalúa la explicación, no memorizar su texto.

## Lab 5 · Perfil del estudiante

**Archivo:** [Lab05PerfilEstudiante.java](Lab05PerfilEstudiante.java). **Modalidad:** casa. **Objetivo:** integrar tipos, salida, una constante y una reasignación observable.

Completa los TODO para mostrar una ficha con nombre, edad, ciudad, promedio, estado activo y la constante CURSO con Java. Después cambia la ciudad mediante una reasignación y muestra el nuevo valor.

| Perfil | Nombre | Edad | Ciudad inicial | Promedio | Activo | Ciudad nueva |
| --- | --- | --- | --- | --- | --- | --- |
| A | Ana | 20 | Cucuta | 4.2 | true | Bogota |
| B | Luis | 25 | Medellin | 3.8 | false | Cali |

Salida esperada para el perfil A:

```text
=== Perfil del estudiante ===
Nombre: Ana
Edad: 20
Ciudad: Cucuta
Promedio: 4.2
Activo: true
Curso: Java
Ciudad actualizada: Bogota
```

Prueba el perfil B modificando solo los datos. Coloca un breakpoint en la reasignación de ciudad: observa el valor antes, ejecuta Step Over y observa el valor después. Registra ambos valores y explica dos elecciones de tipo y qué garantiza final en CURSO.

## Criterios de revisión

| Criterio | Evidencia |
| --- | --- |
| Ejecución | Las cinco clases compilan y se ejecutan por separado. |
| Datos | Tipos compatibles y elecciones justificadas. |
| Salida | Formato solicitado y resultados comparados con una predicción. |
| Diagnóstico | Cuatro errores explicados y corregidos en el lab 4. |
| Depuración | Valor de ciudad observado antes y después en el lab 5. |
| Legibilidad | Nombres claros, indentación de cuatro espacios y TODO completados. |

No se espera una copia de las demos: debes poder explicar cada decisión. Si necesitas ayuda, presenta tu predicción, el mensaje de error y lo que ya intentaste.

## Entrega

Publica las cinco clases y un README con tus comprobaciones en tu repositorio personal. Entrega el enlace en Campus. No subas archivos compilados ni configuración personal de IntelliJ IDEA. No envíes tus soluciones al repositorio oficial del curso.

# Laboratorios de la sesión 1

Completa los TODO de las cinco clases en tu copia personal. Las plantillas compilan desde el inicio, pero no están resueltas: que un archivo compile no significa que el laboratorio esté completo.

Trabaja con IntelliJ IDEA y JDK 21 como referencia del curso; estas clases también son compatibles con JDK 17. Usa tipos explícitos, datos ficticios y nombres claros. No uses Scanner, if, ciclos, conversiones, métodos auxiliares ni dependencias externas en estas actividades.

## Tiempo de práctica y trabajo para casa

**El bloque de laboratorios en clase tiene un máximo de 40 minutos.** El resto de la sesión se dedica a explicación, preguntas y demos del docente.

- Empieza por los labs 1, 2 y 3, en ese orden; no es obligatorio terminar los tres dentro del bloque.
- Al cumplirse los 40 minutos, guarda lo realizado. Completa en casa cualquier lab pendiente y los labs 4 y 5.
- Trae los cinco labs completados a la siguiente clase, en tu repositorio personal, con el enlace listo para entregar en Campus según la indicación del docente.
- Haz únicamente las pruebas mínimas indicadas para cada lab. Las ampliaciones opcionales no son requisito de entrega.
- En clase registra solo los datos probados y el resultado. Completa en casa las respuestas breves; basta una frase por pregunta, sin informes extensos ni capturas obligatorias.

| Tiempo en clase | Actividad |
| --- | --- |
| 0–8 min | Lab 1: saludo |
| 8–18 min | Lab 2: salida |
| 18–35 min | Lab 3: variables |
| 35–40 min | Revisión breve y guardar avances |

## Antes de escribir código

1. Trabaja en tu copia personal y abre la clase indicada en cada lab. No edites ni resuelvas las actividades en el repositorio oficial.
2. Escribe dentro de `public static void main(String[] args)`, entre sus llaves. Conserva el nombre del archivo y el de la clase; no crees otro main.
3. Un `// TODO` es una tarea comentada. Escribe la instrucción Java en una línea nueva sin `//`; una instrucción comentada no se ejecuta. Cuando termines, puedes quitar el TODO o marcarlo como completado.
4. Usa `System.out.println` con esa escritura exacta y punto y coma al final. Texto entre comillas dobles; variables fuera de las comillas. Por ejemplo: `System.out.println("Cantidad: " + cantidad);` requiere que cantidad ya esté declarada e inicializada.
5. Al usar Run, elige la clase del lab actual. Si ejecutas otra clase, verás su salida aunque acabes de editar este archivo.
6. Compara solo la salida de tu programa, no mensajes del IDE como el comando de ejecución o `Process finished with exit code 0`.
7. Salvo que se indique lo contrario, usa las etiquetas y el orden del bloque esperado. Los ejemplos de salida usan textos sin tildes para que la comparación sea directa. No agregues encabezados, resultados de pruebas anteriores ni mensajes de depuración a la versión final.
8. Para probar otro caso, cambia los valores iniciales y ejecuta otra vez. Guarda cada resultado en tu README personal; no necesitas crear otras clases ni automatizar las pruebas.

## Registro de comprobaciones

En el README de tu repositorio personal, crea una sección por lab. Para cada ejecución anota: datos usados, resultado que esperabas, resultado observado y si coincidió. Incluye las respuestas breves solicitadas. No hace falta una captura de pantalla por prueba ni un documento Word.

Los bloques de salida son una referencia para comparar, no código Java que debas pegar dentro de main.

## Método de trabajo

1. Lee el objetivo y predice la salida antes de ejecutar.
2. Completa un TODO a la vez y ejecuta la clase correspondiente.
3. Compara la salida con los requisitos y corrige diferencias.
4. Anota qué comprobaste y explica tus decisiones en comentarios o en tu README personal.

## Lab 1 · Mi primer saludo · Clase: 8 minutos

### Pasos para completar la actividad

1. Abre `Lab01MiPrimerSaludo.java` en tu proyecto personal. Escribe dentro de las llaves de `main`, debajo de los TODO; no crees otra clase ni otro main.
2. Agrega una instrucción `System.out.println` que imprima el texto `Hola, Java!`. Escribe el texto entre comillas dobles y termina la instrucción con `;`.
3. Agrega una segunda instrucción `System.out.println` que imprima `Nombre: ` seguido de un nombre ficticio. En este lab puedes escribir todo el mensaje como texto, sin declarar variables.
4. Agrega una tercera instrucción `System.out.println` que imprima `Meta: ` seguida de una frase sobre lo que quieres aprender.
5. Antes de ejecutar, escribe en un comentario `// Predicción:` las tres líneas que esperas ver. Ese comentario no debe aparecer en la consola.
6. Ejecuta **Run → Lab01MiPrimerSaludo**. Comprueba que aparecen tres líneas y que cada una empieza con la etiqueta indicada abajo. No agregues líneas en blanco ni impresiones de depuración.
7. **Opcional:** cambia solo el texto de la meta y ejecuta otra vez. Comprueba que las otras líneas no cambiaron.
8. En tu README personal, responde: ¿en qué método comienza el programa? ¿Por qué cada mensaje aparece en una línea distinta? Guarda la salida final.

**Terminado cuando:** hay tres instrucciones de salida, una ejecución registrada y dos respuestas de una frase, que puedes completar en casa. Para este lab se evalúan el saludo y las etiquetas; el nombre y la meta pueden variar.

**Archivo:** [Lab01MiPrimerSaludo.java](Lab01MiPrimerSaludo.java). **Modalidad:** clase. **Objetivo:** ejecutar un programa y producir tres líneas.

Completa los TODO para mostrar un saludo, un nombre ficticio y una meta. Ejemplo de formato:

```text
Hola, Java!
Nombre: Ana
Meta: Aprender a ejecutar y comprender un programa Java.
```

Puedes cambiar el nombre y la meta. Comprueba que hay exactamente tres líneas en ese orden. Cambiar la meta y repetir la ejecución es una ampliación opcional. Explica qué hace `main` y qué agrega `println` al final de cada salida.

## Lab 2 · Ordena la salida · Clase: 10 minutos

### Pasos para completar la actividad

1. Abre `Lab02OrdenaLaSalida.java`. Todavía no cambies las tres instrucciones que ya tiene.
2. Escribe en un comentario cómo crees que se distribuyen A, B y C entre las líneas. No agregues println para imprimir la predicción.
3. Ejecuta la clase una vez y guarda su salida original en tu README personal. Explica si coincidió con tu predicción.
4. Modifica esas mismas tres instrucciones: las dos primeras deben usar `System.out.print` para imprimir A y B con el separador ` - `; la tercera debe usar `System.out.println` para imprimir C y terminar la primera línea.
5. Debajo de esas instrucciones agrega un `System.out.println` para imprimir `Fin del laboratorio` en la segunda línea.
6. Ejecuta de nuevo. Compara carácter por carácter con el bloque de salida: un espacio a cada lado de cada guion, ninguna línea vacía y exactamente dos líneas.
7. Escribe en tu README cuál instrucción termina la primera línea y por qué las dos primeras no la terminan.

**Terminado cuando:** conservas la predicción y la salida inicial como evidencia, pero la clase entregada muestra únicamente las dos líneas solicitadas abajo. No dejes dos versiones del programa ejecutándose en el mismo main.

**Archivo:** [Lab02OrdenaLaSalida.java](Lab02OrdenaLaSalida.java). **Modalidad:** clase. **Objetivo:** controlar los saltos de línea.

Antes de modificar el código, escribe tu predicción de la salida inicial. Ejecuta y compara. Después completa los TODO para producir exactamente:

```text
A - B - C
Fin del laboratorio
```

Usa al menos un `print` y un `println`. Comprueba espacios, guiones y saltos. Explica qué instrucciones terminan una línea y cuáles no.

## Lab 3 · Datos con sentido · Clase: 17 minutos

### Pasos para completar la actividad

1. Abre `Lab03DatosConSentido.java`. Dentro de main crea las cinco variables que aparecen en la tabla. Elige un tipo explícito para cada una; no uses var en este lab.
2. Inicializa las variables con el caso A. El nombre usa comillas dobles; la inicial, comillas simples; la edad no lleva comillas; la temperatura usa punto decimal; true/false se escriben sin comillas.
3. Agrega cinco instrucciones `System.out.println`, una por dato, en este orden: nombre, edad, temperatura, inicial y activo.
4. En cada salida concatena la etiqueta con la variable mediante `+`. Por ejemplo, para un dato distinto: `System.out.println("Cantidad: " + cantidad);`. No escribas Ana o 20 directamente en las instrucciones de salida: deben salir de tus variables.
5. Predice la salida del caso A en tu README personal, ejecuta la clase y compara con el bloque esperado de abajo.
6. **Opcional:** prueba el caso B cambiando solo los valores iniciales, sin modificar los println.
7. En casa, justifica el tipo de una variable y explica la diferencia entre String y char en dos frases como máximo.

**Terminado cuando:** las cinco variables tienen tipos apropiados, el caso A muestra cinco líneas y las salidas usan variables, no resultados fijos.

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

**Prueba mínima obligatoria:** caso A. El caso B queda como ampliación opcional. Completa la explicación breve de tipos en casa.

## Lab 4 · Diagnostica y corrige · Casa

### Pasos para completar la actividad

1. Abre `Lab04DiagnosticaYCorrige.java`. Los ejemplos incorrectos están dentro de comentarios; todavía no se ejecutan.
2. Para el caso 1, copia únicamente el fragmento Java que está después de `Caso 1:` a una línea nueva dentro de main. No copies las palabras `Caso 1:`. Deja la instrucción incorrecta activa, intenta Run y anota el diagnóstico.
3. Corrige ese fragmento conservando el nombre Ana como String. Agrega un `System.out.println` que muestre la etiqueta `Nombre: ` y la variable nombre. Ejecuta hasta que compile antes de pasar al caso 2.
4. Repite el proceso con el caso 2: activa el fragmento Java, observa el error y elige un tipo que conserve 23.5. No cambies 23.5 por 23 para ocultar el error. Agrega una salida con `Temperatura: ` y la variable temperatura.
5. Para el caso 3, activa las dos instrucciones indicadas, observa el error e inicializa edad con 20 antes de imprimirla. Ajusta esa impresión para mostrar `Edad: ` y la variable edad.
6. Para el caso 4, activa la declaración final y su reasignación. Observa el diagnóstico; elimina la reasignación, conserva final y agrega la impresión `Curso: ` con CURSO. No elimines final para resolver este caso.
7. Mantén las correcciones de los casos anteriores mientras avanzas, pero no declares dos veces la misma variable. Al final deja una sola versión corregida de cada caso y ninguna instrucción inválida activa.
8. Ejecuta la clase completa y comprueba exactamente cuatro líneas: `Nombre: Ana`, `Temperatura: 23.5`, `Edad: 20` y `Curso: Java`, en ese orden.
9. En tu README personal registra cuatro filas: caso, mensaje observado, causa y corrección. No necesitas copiar todos los detalles internos del IDE: identifica el mensaje relevante.

**Terminado cuando:** los cuatro errores fueron observados y explicados, la versión final compila y cada dato se imprime una sola vez. Los comentarios originales pueden permanecer como referencia.

**Archivo:** [Lab04DiagnosticaYCorrige.java](Lab04DiagnosticaYCorrige.java). **Modalidad:** casa, para la siguiente clase. **Objetivo:** usar los diagnósticos del compilador para corregir cuatro errores.

Los fragmentos incorrectos están comentados. Activa uno por vez en tu copia personal, intenta compilar, lee el diagnóstico y corrígelo antes de pasar al siguiente. No dejes errores activos al entregar.

| Caso | Requisito de la corrección |
| --- | --- |
| Texto con comillas incorrectas | Conservar Ana como String y mostrar `Nombre: Ana`. |
| Decimal asignado a int | Conservar 23.5 usando un tipo apropiado y mostrar `Temperatura: 23.5`. |
| Variable local sin inicializar | Dar a edad el valor 20 antes de leerla y mostrar `Edad: 20`. |
| Reasignación de final | Mantener CURSO como final con Java y mostrar `Curso: Java`; eliminar la reasignación. |

La clase corregida debe mostrar esas cuatro líneas en ese orden. Para cada caso, registra en tu README personal el mensaje observado, la causa y tu corrección. Los mensajes pueden variar según el IDE o compilador: se evalúa la explicación, no memorizar su texto.

## Lab 5 · Perfil del estudiante · Casa

### Pasos para completar la actividad

1. Abre `Lab05PerfilEstudiante.java`. Declara nombre, edad, ciudad, promedio y activo con tipos explícitos e inicialízalos usando el perfil A de la tabla.
2. Declara `final String CURSO` e inicialízalo con `"Java"`. No intentes cambiar su valor más adelante.
3. Agrega un println para el encabezado `=== Perfil del estudiante ===`.
4. Agrega seis println para imprimir las etiquetas Nombre, Edad, Ciudad, Promedio, Activo y Curso, cada una con `: ` y su variable. Respeta ese orden. No escribas los valores directamente dentro de los mensajes.
5. Después de mostrar la ficha inicial, escribe una reasignación de ciudad con la ciudad nueva del perfil A. No vuelvas a escribir el tipo String: la variable ya existe.
6. Debajo de la reasignación agrega un println con `Ciudad actualizada: ` y la variable ciudad.
7. Ejecuta la clase y compara sus ocho líneas con el bloque de salida esperado.
8. Coloca un breakpoint en la línea que reasigna ciudad y ejecuta Debug. Antes de ejecutar la línea debes ver Cucuta; después de Step Over debes ver Bogota. Registra ambos valores en tu README.
9. **Opcional:** prueba el perfil B cambiando únicamente los datos, incluida la ciudad nueva.
10. Escribe una justificación de tipo y una frase sobre lo que impide final. Conserva la salida del perfil A y una nota con los dos valores observados de ciudad.

**Terminado cuando:** el perfil A produce ocho líneas coherentes y anotaste la ciudad antes y después de reasignarla.

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

El perfil B es opcional; el perfil A es la prueba mínima obligatoria. Coloca un breakpoint en la reasignación de ciudad: observa el valor antes, ejecuta Step Over y observa el valor después. Registra ambos valores y explica una elección de tipo y qué garantiza final en CURSO, con una frase por respuesta.

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

Para la siguiente clase, publica las cinco clases y un README breve con las comprobaciones mínimas en tu repositorio personal. Completa en casa todo lo que no terminaste en los 40 minutos. Entrega el enlace en Campus. No subas archivos compilados ni configuración personal de IntelliJ IDEA. No envíes tus soluciones al repositorio oficial del curso.

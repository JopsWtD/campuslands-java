# Laboratorios de la sesión 2

Dispones de **un máximo de 40 minutos de laboratorios en clase**; el trabajo pendiente se completa en casa para la siguiente clase. Completa los TODO en tu repositorio personal. Usa JDK 21 como referencia; el código también es compatible con Java 17. Trabaja con datos inicializados y ejecuciones manuales, sin Scanner, ciclos, métodos auxiliares, dependencias ni excepciones.

Cada clase inicial compila, pero contiene tareas pendientes. Primero predice, después implementa y finalmente compara. No publiques solo capturas: registra entradas y resultados en tu README personal.

## Tiempo de práctica y trabajo para casa

**El bloque de laboratorios en clase tiene un máximo de 40 minutos.** El resto de la sesión se dedica a explicación, preguntas y demos del docente.

- Empieza por los labs 1, 2 y 3, en ese orden; no es obligatorio terminar los tres dentro del bloque.
- Al cumplirse los 40 minutos, guarda lo realizado. Completa en casa cualquier lab pendiente y los labs 4 y 5.
- Trae los cinco labs completados a la siguiente clase, en tu repositorio personal, con el enlace listo para entregar en Campus según la indicación del docente.
- Haz únicamente las pruebas mínimas indicadas para cada lab. Las ampliaciones opcionales no son requisito de entrega.
- En clase registra solo los datos probados y el resultado. Completa en casa las respuestas breves; basta una frase por pregunta, sin informes extensos ni capturas obligatorias.

| Tiempo en clase | Actividad |
| --- | --- |
| 0–10 min | Lab 1: operadores |
| 10–22 min | Lab 2: acceso |
| 22–37 min | Lab 3: categorías |
| 37–40 min | Revisión breve y guardar avances |

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

## Lab 1 · Calcula y predice · Clase: 10 minutos

### Pasos para completar la actividad

1. Abre `S02Lab01CalculaYPredice.java`. Mantén las tres variables iniciales: unidades=7, capacidad=2 y contador=3. Escribe las nuevas instrucciones dentro de main, debajo de los TODO.
2. Antes de programar, copia la tabla siguiente a tu README personal y llena la columna **Mi predicción** con tus cálculos. No imprimas las predicciones en la consola del programa.
3. Declara variables para los primeros seis resultados: suma, resta, producto, divisionEntera, divisionDecimal y resto. Usa int para todos excepto divisionDecimal, que debe ser double. Calcula usando las expresiones de la tabla; no asignes directamente los resultados 9, 5, 14, etc.
4. Agrega un `System.out.println` por cada resultado, en el orden de la tabla. Escribe la etiqueta entre comillas, luego `+` y la variable. Ejemplo para otro dato: `System.out.println("Cantidad: " + cantidad);`.
5. Para las filas de precedencia, imprime las expresiones `2 + 3 * 4` y `(2 + 3) * 4` con sus respectivas etiquetas. Cuando concatenes una expresión numérica directamente, enciérrala entre paréntesis: `"Etiqueta: " + (expresion)`. Así se calcula antes de unirla al texto.
6. Incrementa contador usando `contador++;` como instrucción separada y después imprime su valor con `Contador incrementado: `. Luego usa `contador--;` y muestra `Contador decrementado: `. No incrementes dentro del println en esta actividad.
7. Ejecuta Run sobre esta clase. Compara las diez líneas con el bloque esperado y llena **Resultado observado** en tu tabla. Si no coinciden, revisa la expresión; no cambies la salida esperada para ajustarla a un error.
8. **Opcional:** cambia únicamente unidades de 7 a 8 y vuelve a ejecutar. Verifica suma=10, resta=6, producto=16, divisionEntera=4 y resto=0. La división decimal sigue siendo 3.5 porque la expresión solicitada conserva el literal 7.0.
9. Guarda la salida inicial y responde brevemente en casa: ¿por qué 7/2 no produce 3.5? ¿Qué representa %? ¿Cómo cambian el orden los paréntesis?

| Resultado | Expresión que debes calcular | Etiqueta del println | Mi predicción | Resultado observado |
| --- | --- | --- | --- | --- |
| suma | `unidades + capacidad` | `Suma: ` | Completar | Completar |
| resta | `unidades - capacidad` | `Resta: ` | Completar | Completar |
| producto | `unidades * capacidad` | `Producto: ` | Completar | Completar |
| divisionEntera | `unidades / capacidad` | `Division entera: ` | Completar | Completar |
| divisionDecimal | `7.0 / capacidad` | `Division decimal: ` | Completar | Completar |
| resto | `unidades % capacidad` | `Resto: ` | Completar | Completar |
| Primera precedencia | `2 + 3 * 4` | `Sin parentesis: ` | Completar | Completar |
| Segunda precedencia | `(2 + 3) * 4` | `Con parentesis: ` | Completar | Completar |
| Primer cambio | Valor de contador después de `contador++` | `Contador incrementado: ` | Completar | Completar |
| Segundo cambio | Valor de contador después de `contador--` | `Contador decrementado: ` | Completar | Completar |

**Terminado cuando:** el caso inicial produce diez líneas, cada resultado viene de un cálculo y registraste una ejecución con unidades=7. No escribas `println("Suma: 9")`: eso muestra un resultado fijo, no demuestra el uso de operadores.

**Archivo:** [S02Lab01CalculaYPredice.java](S02Lab01CalculaYPredice.java).

Con unidades=7, capacidad=2 y contador=3, completa las expresiones y muestra:

```text
Suma: 9
Resta: 5
Producto: 14
Division entera: 3
Division decimal: 3.5
Resto: 1
Sin parentesis: 14
Con parentesis: 20
Contador incrementado: 4
Contador decrementado: 3
```

La división decimal de este ejercicio es `7.0 / capacidad`. **Ampliación opcional:** prueba unidades=8, manteniendo las demás entradas. Cambian suma, resta, producto, división entera y resto; la división decimal conserva el numerador literal 7.0. Explica esa diferencia y por qué % no calcula un porcentaje. Registra tu predicción antes de ejecutar.

## Lab 2 · Reglas de acceso · Clase: 12 minutos

### Pasos para completar la actividad

1. Abre `S02Lab02ReglasDeAcceso.java` y conserva los cuatro datos iniciales. No agregues lectura por teclado.
2. Escribe un comentario con la regla completa: ser mayor de edad, tener al menos una autorización y no estar bloqueado.
3. Declara `boolean puedeEntrar`. Construye su expresión con tres requisitos: edad al menos 18; membresía o invitación; ausencia de bloqueo. Usa && para exigir requisitos simultáneos, || para las dos autorizaciones alternativas y ! para negar bloqueado. Agrupa las autorizaciones entre paréntesis.
4. Escribe un if cuya condición sea puedeEntrar. En la rama verdadera agrega un println con `Acceso permitido`; en else agrega uno con `Acceso denegado`. No imprimas ambos mensajes fuera del if.
5. Ejecuta con los datos iniciales: edad=18, miembro=false, invitación=true, bloqueo=false. Debe aparecer una sola línea: `Acceso permitido`.
6. **Pruebas mínimas:** ejecuta el caso inicial permitido; luego edad=17 con las otras entradas iniciales; finalmente edad=18 y bloqueado=true con la invitación inicial. Debes obtener permitido, denegado y denegado. Las demás filas son opcionales. Cambia las variables iniciales, ejecuta y registra cada resultado; no agregues un ciclo. Restablece las cuatro entradas para cada fila, sin arrastrar cambios del caso anterior.
7. **Opcional:** observa puedeEntrar con un breakpoint y Step Over.
8. Explica en tu README qué agrupación evita permitir acceso a un menor con invitación y por qué un bloqueo niega siempre el acceso.

**Terminado cuando:** cada ejecución muestra un único mensaje y registraste las tres pruebas mínimas de edad y bloqueo.

**Archivo:** [S02Lab02ReglasDeAcceso.java](S02Lab02ReglasDeAcceso.java).

Regla: permitir acceso cuando edad >= 18, exista membresía o invitación y no haya bloqueo. Construye un boolean con nombre claro y usa if/else para mostrar exactamente `Acceso permitido` o `Acceso denegado`.

| Edad | Miembro | Invitación | Bloqueado | Resultado |
| --- | --- | --- | --- | --- |
| 17 | true | true | false | Denegado |
| 18 | false | true | false | Permitido |
| 19 | true | false | false | Permitido |
| 18 | false | false | false | Denegado |
| 18 | true | true | true | Denegado |

### Ampliación opcional: ocho combinaciones con edad 18

Haz una ejecución por fila; las columnas indican exactamente qué valores asignar a las variables.

| esMiembro | tieneInvitacion | bloqueado | Mensaje esperado |
| --- | --- | --- | --- |
| false | false | false | Acceso denegado |
| false | false | true | Acceso denegado |
| false | true | false | Acceso permitido |
| false | true | true | Acceso denegado |
| true | false | false | Acceso permitido |
| true | false | true | Acceso denegado |
| true | true | false | Acceso permitido |
| true | true | true | Acceso denegado |

No es obligatorio registrar estas ocho combinaciones. Explica dónde necesitas AND, OR y NOT. Un bloqueo debe negar el acceso aunque los demás requisitos se cumplan. La observación con Debug es opcional en este lab.

## Lab 3 · Clasifica resultados · Clase: 15 minutos

### Pasos para completar la actividad

1. Abre `S02Lab03ClasificaResultados.java` y deja nota=85 para la primera prueba.
2. Escribe la primera condición para detectar nota menor que 0 O mayor que 100. Si es verdadera, usa println para mostrar únicamente `Nota invalida`.
3. Continúa esa misma cadena con else if: primero comprueba el rango A, luego B, C y D; reserva el else final para E. No uses cinco if independientes, porque podrían imprimir varias categorías para una misma nota.
4. Dentro de cada rama válida escribe un único println con `Categoria A`, `Categoria B`, `Categoria C`, `Categoria D` o `Categoria E`, según corresponda. No agregues el valor de nota ni encabezados a la salida requerida.
5. Ejecuta con 85 y comprueba que aparece una única línea: `Categoria B`.
6. Haz tres pruebas mínimas: nota=85 (Categoria B), nota=90 (Categoria A) y nota=101 (Nota invalida). Cambia únicamente nota y registra el resultado. La tabla completa queda para pruebas opcionales.
7. Explica qué pasaría con nota=95 si el primer rango válido fuera >=60. No necesitas conservar una versión incorrecta del código.

**Terminado cuando:** tanto las notas inválidas como las válidas muestran exactamente una línea y se comprobaron las tres entradas mínimas: 85, 90 y 101.

**Archivo:** [S02Lab03ClasificaResultados.java](S02Lab03ClasificaResultados.java).

La nota es un entero de 0 a 100. Antes de clasificar, rechaza valores fuera del rango. Usa una cadena if/else if/else con A desde 90, B desde 80, C desde 70, D desde 60 y E por debajo de 60. Muestra `Categoria A`, `Categoria B`, etc., o solo `Nota invalida`.

| Notas | Resultado |
| --- | --- |
| -1, 101 | Nota invalida |
| 0, 59 | Categoria E |
| 60, 69 | Categoria D |
| 70, 79 | Categoria C |
| 80, 89 | Categoria B |
| 90, 100 | Categoria A |

Con nota=85 se espera `Categoria B`. La tabla muestra los rangos; probar todos sus valores es opcional. Explica qué ocurriría si comprobaras nota>=60 antes de nota>=90 sin cambiar las demás ramas. Estas categorías pertenecen al ejercicio; no representan una escala institucional de calificación.

## Lab 4 · Elige la entrega · Casa

### Pasos para completar la actividad

1. Abre `S02Lab04EligeLaEntrega.java`. Comienza con tipoEntrega="EXPRESS". Es un texto fijo, no un dato que debas solicitar por teclado.
2. Declara un long llamado costoCentavos y determina su valor con switch según la tabla. Para default usa -1 como señal interna de opción desconocida.
3. Si usas switch clásico, asigna costoCentavos en cada case y añade break. Si usas switch como expresión con flechas, asigna el valor que devuelve a costoCentavos y no añadas break.
4. Después del switch, usa if para comprobar si costoCentavos es negativo. En ese caso imprime solo `Tipo de entrega invalido`.
5. En el else de opción válida declara un String llamado etiqueta. Asígnalo con un ternario: si el contenido de tipoEntrega es RECOGIDA, elegir `Retiro en tienda`; en caso contrario, `Entrega a domicilio`. Compara contenido con equals, no con ==.
6. En esa misma rama válida agrega dos println: uno con `Costo (centavos): ` y costoCentavos; otro con `Etiqueta: ` y etiqueta. No imprimas el costo -1 ni una etiqueta para la opción inválida.
7. Ejecuta cuatro veces cambiando tipoEntrega por ESTANDAR, EXPRESS, RECOGIDA y DRON. Registra las dos líneas de cada opción válida y la única línea de la inválida.
8. Entrega una sola forma de switch y escribe una frase sobre break o las flechas. **Opcional:** reemplázala temporalmente por la otra forma y compara resultados.

**Terminado cuando:** las tres modalidades válidas muestran costo y etiqueta; DRON muestra solo el error, y puedes explicar las dos formas de switch.

**Archivo:** [S02Lab04EligeLaEntrega.java](S02Lab04EligeLaEntrega.java).

El texto tipoEntrega debe ser no null y estar en mayúsculas. Usa switch y default para resolver:

| Tipo | Costo en centavos | Etiqueta |
| --- | --- | --- |
| ESTANDAR | 500 | Entrega a domicilio |
| EXPRESS | 1200 | Entrega a domicilio |
| RECOGIDA | 0 | Retiro en tienda |
| DRON o cualquier otro texto | No válido | No mostrar etiqueta |

En una opción válida, muestra dos líneas. Para EXPRESS:

```text
Costo (centavos): 1200
Etiqueta: Entrega a domicilio
```

Elige la etiqueta mediante un ternario simple y compara contenido de texto con equals. En una opción desconocida muestra únicamente `Tipo de entrega invalido`. Puedes usar -1 como señal interna; no lo muestres como costo válido.

Entrega una sola versión de switch. Compararla con la otra sintaxis es opcional; no es necesario entregar código duplicado.

## Lab 5 · Motor de promociones · Casa

### Pasos para completar la actividad

1. Abre `S02Lab05MotorPromociones.java` y conserva las cuatro entradas iniciales. Calcula en tu README el descuento, neto, envío y total esperado antes de escribir las decisiones.
2. Crea un boolean llamado datosValidos que sea verdadero únicamente si subtotalCentavos está entre 0 y 1_000_000 inclusive y cantidad es mayor que 0. La cantidad sirve para validar; no multipliques otra vez el subtotal por ella.
3. Escribe if/else para separar datos inválidos de válidos. En la rama inválida imprime solo `Pedido invalido: subtotal o cantidad fuera de rango`. Escribe todos los pasos siguientes dentro de la rama de datos válidos para que no se calculen pedidos rechazados.
4. Dentro de esa rama, calcula envioCentavos como long mediante switch de tipoEntrega: ESTANDAR=500, EXPRESS=1200, RECOGIDA=0 y default=-1.
5. Separa de nuevo con if/else: si envioCentavos es negativo, imprime solo `Pedido invalido: tipo de entrega desconocido`; en su else continúa con el cálculo de promociones. No añadas throw ni excepciones.
6. Declara un int porcentajeDescuento. Asígnale 10 si es miembro y subtotalCentavos>=10_000; 5 si no es miembro y subtotalCentavos>=20_000; 0 en los demás casos. Usa una cadena if/else if/else, sin sumar porcentajes.
7. Declara long descuentoCentavos y calcúlalo como `subtotalCentavos * porcentajeDescuento / 100`. No uses 0.10 o 0.05: porcentajeDescuento almacena el entero 10 o 5. La división entera descarta fracciones de centavo, como exige el ejercicio.
8. Declara long netoCentavos y réstale descuentoCentavos al subtotal.
9. Crea un boolean envioGratis que exija simultáneamente entrega ESTANDAR y netoCentavos>=25_000. Compara el texto con equals. Si se cumple, reasigna envioCentavos a 0. No apliques esta gratuidad a EXPRESS.
10. Declara long totalCentavos y súmale envioCentavos al neto. No vuelvas a restar el descuento.
11. Agrega seis println, solo en la rama de pedido válido, con las etiquetas exactas del bloque esperado: Subtotal (centavos), Descuento (%), Descuento (centavos), Neto (centavos), Envio (centavos) y Total (centavos). Cada etiqueta lleva `: ` y se concatena con su variable.
12. Ejecuta el caso inicial y compara sus seis líneas. Si falla, revisa en orden porcentaje, descuento, neto, envío y total para localizar la primera diferencia.
13. **Tres pruebas válidas obligatorias:** caso inicial; subtotal=26314, cantidad=1, no miembro y ESTANDAR; subtotal=26315, cantidad=1, no miembro y ESTANDAR. Las demás filas son opcionales. Prueba una fila elegida por ejecución. La primera fila usa cantidad=4; las demás, cantidad=1. Cambia también esMiembro y tipoEntrega según cada fila. Registra las entradas y las seis salidas sin cambiar las fórmulas.
14. Haz dos pruebas inválidas obligatorias: cantidad=0 y tipoEntrega="DRON", por separado, restaurando antes de cada una el caso inicial válido. Las otras tres entradas inválidas son opcionales. Comprueba una sola línea de error y ninguna línea de desglose ni total.
15. **Opcional:** en Debug, coloca un breakpoint en la condición que decide el envío gratis. Observa netoCentavos antes de evaluarla y envioCentavos después. Compara los casos 26314 y 26315, ambos no miembros y ESTANDAR.
16. En tu README personal explica por qué se prueba el neto, por qué el envío EXPRESS sigue cobrando y cómo se descartan fracciones de centavo. Revisa nombres y repite una prueba después de cualquier cambio.

**Terminado cuando:** las entradas válidas muestran seis líneas correctas, cada entrada inválida muestra solo su mensaje y registraste cinco pruebas mínimas: tres válidas y dos inválidas. No imprimas los resultados como textos fijos: cada importe debe provenir de las variables calculadas.

**Archivo:** [S02Lab05MotorPromociones.java](S02Lab05MotorPromociones.java).

Integra operadores y decisiones en un pedido. Entradas: subtotalCentavos como long, cantidad como int, esMiembro como boolean y tipoEntrega como String no null. Todo importe se muestra en centavos.

### Reglas

1. Rechaza subtotal menor que 0 o mayor que 1_000_000, o cantidad <= 0. Muestra solo `Pedido invalido: subtotal o cantidad fuera de rango`.
2. Si el tipo no es ESTANDAR, EXPRESS o RECOGIDA, muestra solo `Pedido invalido: tipo de entrega desconocido`.
3. Miembro y subtotal >= 10_000: 10 % de descuento.
4. No miembro y subtotal >= 20_000: 5 % de descuento.
5. En los demás casos: 0 %.
6. Descuento en centavos = subtotal × porcentaje / 100. Descarta cualquier fracción de centavo mediante división entera.
7. Neto = subtotal − descuento.
8. Envío: ESTANDAR=500, EXPRESS=1200, RECOGIDA=0.
9. Envío gratis únicamente para ESTANDAR si el neto >= 25_000. Comprueba el neto, no el subtotal.
10. Total = neto + envío. No presentes un desglose de pedido válido cuando alguna entrada sea inválida.

El porcentaje se selecciona con if/else if/else y la modalidad con switch. No acumules promociones: se aplica una sola tasa.

### Caso inicial esperado

Con subtotal=18_500, cantidad=4, miembro=true y EXPRESS:

```text
Subtotal (centavos): 18500
Descuento (%): 10
Descuento (centavos): 1850
Neto (centavos): 16650
Envio (centavos): 1200
Total (centavos): 17850
```

### Matriz de referencia: tres filas obligatorias y el resto opcional

En las filas sin cantidad explícita, usa cantidad=1.

| Subtotal | Miembro | Entrega | Descuento | Neto | Envío | Total |
| --- | --- | --- | --- | --- | --- | --- |
| 18500, cantidad=4 | true | EXPRESS | 1850 | 16650 | 1200 | 17850 |
| 9999 | true | ESTANDAR | 0 | 9999 | 500 | 10499 |
| 10000 | true | ESTANDAR | 1000 | 9000 | 500 | 9500 |
| 10001 | true | ESTANDAR | 1000 | 9001 | 500 | 9501 |
| 19999 | false | ESTANDAR | 0 | 19999 | 500 | 20499 |
| 20000 | false | ESTANDAR | 1000 | 19000 | 500 | 19500 |
| 20001 | false | ESTANDAR | 1000 | 19001 | 500 | 19501 |
| 8000 | false | RECOGIDA | 0 | 8000 | 0 | 8000 |
| 26314 | false | ESTANDAR | 1315 | 24999 | 500 | 25499 |
| 26315 | false | ESTANDAR | 1315 | 25000 | 0 | 25000 |
| 26316 | false | ESTANDAR | 1315 | 25001 | 0 | 25001 |
| 26315 | false | EXPRESS | 1315 | 25000 | 1200 | 26200 |
| 0 | false | RECOGIDA | 0 | 0 | 0 | 0 |
| 1000000 | true | ESTANDAR | 100000 | 900000 | 0 | 900000 |

Debes probar cantidad=0 y entrega=DRON. Subtotal=-1, subtotal=1_000_001 y cantidad=-1 son pruebas opcionales. Cambia una entrada inválida por vez y verifica el mensaje y la ausencia de un total válido. Para DRON usa los demás datos válidos. La cantidad valida el pedido; el subtotal ya es el total de sus productos, no lo multipliques de nuevo por cantidad.

### Pruebas inválidas: cantidad=0 y DRON obligatorias; las otras opcionales

Restaura primero subtotalCentavos=18500, cantidad=4, esMiembro=true y tipoEntrega="EXPRESS". Después modifica únicamente el dato indicado en cada fila.

| Cambiar solo | Mensaje esperado, sin otras líneas |
| --- | --- |
| subtotalCentavos = -1 | Pedido invalido: subtotal o cantidad fuera de rango |
| subtotalCentavos = 1000001 | Pedido invalido: subtotal o cantidad fuera de rango |
| cantidad = 0 | Pedido invalido: subtotal o cantidad fuera de rango |
| cantidad = -1 | Pedido invalido: subtotal o cantidad fuera de rango |
| tipoEntrega = "DRON" | Pedido invalido: tipo de entrega desconocido |

**Opcional:** coloca un breakpoint antes de la condición de envío gratis y observa descuentoCentavos, netoCentavos y envioCentavos. Compara dos casos en lados distintos de esa frontera.

## Revisión breve en clase · 3 minutos y entrega siguiente clase

En los últimos tres minutos, muestra al docente una salida de los labs trabajados y guarda tus avances. Intercambiar una prueba con otra pareja es opcional. Explica un error encontrado o una prueba que habría detectado un error posible. No añadas nuevas funcionalidades para terminar antes.

Completa en casa los labs pendientes y los labs 4–5. Para la siguiente clase, publica las cinco clases y un README breve con las pruebas mínimas en tu repositorio personal; entrega el enlace en Campus según la indicación del docente. Incluye entradas, salidas mínimas y una explicación breve de un operador o decisión por lab. No se exige captura de Debug ni ejecutar toda la matriz ampliada. No entregues soluciones en el repositorio oficial ni archivos .class o configuración personal del IDE.

| Criterio | Evidencia |
| --- | --- |
| Reglas | Condiciones y tasas representan exactamente los requisitos. |
| Estructuras | if, switch y ternario elegidos con claridad; sin anidación innecesaria. |
| Pruebas | Casos normales, límites e inválidos comparados con resultados esperados. |
| Explicación | Una frase por lab sobre un operador o decisión; Debug adicional es opcional. |
| Legibilidad | Nombres claros, cuatro espacios de indentación y TODO resueltos. |

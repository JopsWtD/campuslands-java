# Reto 3 - Control de producción y calidad

Programa que revisa las medidas de un lote de piezas y detiene la línea si hay 3 rechazos seguidos.

## Clasificación

- Aprobada: de 9.8 a 10.2
- Reproceso: de 9.5 a menos de 9.8, o de más de 10.2 a 10.5
- Rechazada: menos de 9.5 o más de 10.5

## Decisiones

Usamos un `for` para recorrer las piezas porque desde el inicio se sabe cuántas tiene el lote, entonces el ciclo se repite hasta llegar a esa cantidad.

Para pedir la cantidad y las medidas usamos `do-while`, porque el dato se pide al menos una vez y se vuelve a pedir si no es válido. Si el dato es inválido no se cuenta como inspección.

Llevamos dos contadores de rechazos: `rechazadas`, que es el total, y `rechazadasConsecutivas`, que vuelve a 0 cuando sale una pieza aprobada o de reproceso.

Cuando `rechazadasConsecutivas` llega a 3, se muestra la alerta y se usa `break` para salir del `for` y no pedir más medidas. Esa tercera pieza sí se cuenta en las inspeccionadas y en el promedio.

Los promedios se dividen entre las piezas inspeccionadas y no entre el tamaño del lote, por si la línea se detiene antes.

## Pruebas

| Entrada | Resultado |
| --- | --- |
| 6 piezas: 9.5, 9.8, 10.0, 10.2, 10.5, 10.6 | 3 aprobadas, 2 reproceso, 1 rechazada. Aprobación 50 %, promedio 10.1 |
| 5 piezas: 9.4, 10.6, 10.7 | Alerta en la tercera. 3 rechazadas, aprobación 0 %, promedio 10.23. No pide las piezas 4 y 5 |
| 4 piezas: 9.4, 10.6, 10.0, 9.4 | 1 aprobada, 3 rechazadas, sin alerta |
| Cantidad 0 | Muestra error y la vuelve a pedir |
| Medida 0 | Muestra error y la vuelve a pedir sin contarla |
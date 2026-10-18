public class Lab02OrdenaLaSalida {
    public static void main(String[] args) {
        // TODO 1: Predecir la salida de estas tres instrucciones en un comentario.
        System.out.print("A");
        System.out.println("B");
        System.out.println("C");

        /*CONSOLA
                AB
                C
        */
        // TODO 2: Ejecutar y explicar cualquier diferencia con tu predicción.

        // No hay ninguna diferencia con la prediccion, ya que la salida es la misma que predije.


        // TODO 3: Modificar las instrucciones anteriores para obtener:
        // A - B - C
        System.out.print("A - ");
        System.out.print("B - ");
        System.out.println("C");
        // TODO 4: Agregar debajo una segunda línea que diga "Fin del laboratorio".
        System.out.println("Fin del laboratorio");
        // TODO 5: Explicar qué instrucción produce cada salto de línea.
        // Aqui la instruccion que nos genera el salto de linea es el "ln" luego de el print (println).
    }
}
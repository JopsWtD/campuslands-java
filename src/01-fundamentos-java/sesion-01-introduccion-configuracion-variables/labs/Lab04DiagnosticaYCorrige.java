public class Lab04DiagnosticaYCorrige {
    public static void main(String[] args) {
        // En tu copia personal, activa un caso por vez, lee el error y repáralo.
        // Los casos están comentados para que esta plantilla pueda compilar.

        // Caso 1: String nombre = 'Ana';
        // TODO 1: Corregir las comillas, mostrar el nombre y explicar la causa.
        String nombre = "Ana"; // El unico tipo de dato que DEBE usar comillas simples es el char, y el String debe usar comillas dobles, por lo que se corrige el error de sintaxis.
        System.out.println("Nombre: " + nombre);

        // Caso 2: int temperatura = 23.5;

        float temperatura = 23.5f; // Se cambia el tipo de dato a float, ya que el int no puede tener decimales y el float si, por lo que se corrige el error de sintaxis.
        System.out.println("Temperatura: " + temperatura);
        // TODO 2: Conservar el valor decimal usando un tipo adecuado y mostrarlo.
        // Caso 3:
        // int edad;
        // System.out.println(edad);
        float precio = 19.99f; // Se inicializa la variable precio con un valor decimal, ya que el int no puede tener decimales y el float si, por lo que se corrige el error de sintaxis.
        System.out.println("Precio: " + precio);
        // TODO 3: Inicializar edad antes de mostrarla y explicar por qué es necesario.
        byte edad = 25; // Si no la inicializamos con un valor el compilador no sabra que valor mostrar y dara un error de sintaxis
        System.out.println("Edad: " + edad);
        // Caso 4:
        // final String CURSO = "Java";
        // CURSO = "Python";
        // TODO 4: Conservar CURSO como final y mostrar "Java", sin reasignarlo.
        final String CURSO = "Java"; // Se declara la variable CURSO como final, ya que no se puede reasignar un valor a una variable final, por lo que se corrige el error de sintaxis.
        // TODO 5: Registrar los cuatro mensajes del compilador en tu README personal,
        // junto con la causa y la corrección aplicada a cada caso.

    }
}
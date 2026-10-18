public class Lab03DatosConSentido {
    public static void main(String[] args) {
        // TODO 1: Elegir y justificar los tipos para nombre, edad, temperatura,
        String nombre = "Jhorman Peñaloza"; // En este caso el tipo de dato es String,Esto por que estamos usando una cadena de char, ('K' + 'l' + 'e' + 'i' + 'd' + 'e' + 'r' + 's' + 'o' + 'n').

        byte edad = 18 ; // Aqui hablamos de un dato de  tipo byte, ya que la edad es un numero entero y no es tan grande ya que una persona por mucho logra vivir 100 años y el byte va desde -128 a 127, por lo que es un tipo de dato adecuado para la edad de una persona.

        float temperatura = 36.5f; // en este caso en temperatura usamos un tipo de dato float por que pueede tener decimales y el float es un tipo de dato que nos permite tener decimales y es mas pequeño que un double, por lo que es adecuado para la temperatura de una persona.


        // TODO 2: Declarar e inicializar las cinco variables con nombres claros.

        int numeroDeHermanos = 4;
        String ciudadDeNacimiento = "Bogota";
        boolean cajaAbierta = true;
        int cantidadDeLibros = 20;
        short estudiantesActivos = 6000;

        // TODO 3: Mostrar cada dato en su propia línea, con una etiqueta.
        System.out.println("Número de hermanos de " + nombre + ": " + numeroDeHermanos);
        System.out.println("Ciudad de nacimiento de " + nombre + ": " + ciudadDeNacimiento);
        System.out.println("Caja abierta: " + cajaAbierta);
        System.out.println("Cantidad de libros en la biblioteca: " + cantidadDeLibros);
        System.out.println("Estudiantes activos en la UFPS: " + estudiantesActivos);

        // TODO 4: Probar el caso A del README; el caso B es opcional.
        boolean activo = true;
        char inicial = 'A';
        System.out.println("|| Caso | nombre | edad | temperatura | inicial | activo ||");
        System.out.println("|   A   | " + nombre + " | " + edad + " | " + temperatura + " | " + inicial + " | " + activo + " |");
        // TODO 5: Explicar por qué String no es un tipo primitivo.


        // Esto se debe a que String es una clase en Java, y es un objeto que se utiliza para representar las cadenas de char o caracteres. Por eso al ser un objeto puede recibir metodos y atributo como el lenght(), trim(), toUpperCase().



    }
}
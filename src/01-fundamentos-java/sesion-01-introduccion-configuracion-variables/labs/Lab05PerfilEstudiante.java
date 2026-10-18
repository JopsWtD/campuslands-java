public class Lab05PerfilEstudiante {
    public static void main(String[] args) {
        // TODO 1: Identificar los tipos de nombre, edad, ciudad, promedio y activo.

        String nombre;
        byte edad;
        String ciudad;
        float promedio;
        boolean activo;
        // TODO 2: Declarar e inicializar esos datos con nombres claros.
        nombre = "Ana";
        edad = 25;
        ciudad = "Madrid";
        promedio = 8.5f;
        activo = true;
        // TODO 3: Declarar final String CURSO con el valor "Java".
        final String CURSO = "Java";
        // TODO 4: Mostrar la ficha inicial con etiquetas legibles.
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Activo: " + activo);
        System.out.println("Curso: " + CURSO);
        // TODO 5: Reasignar ciudad para representar un cambio de residencia y mostrar
        // "Ciudad actualizada: " con el nuevo valor, conservando el mismo tipo.
        String ciudadNueva = "Barcelona";
        System.out.println("Ciudad actualizada: " + ciudadNueva);
        // TODO 6: Probar el perfil A del README; el perfil B es opcional.
        /*
        | Perfil | nombre | edad | ciudad | promedio | activo | Ciudad nueva |
        | --- | --- | --- | --- | --- | --- | --- |
        | A · obligatorio | Ana | 20 | Cucuta | 4.2 | true | Bogota |

        */

        System.out.println("|| Perfil | nombre | edad | ciudad | promedio | activo | Ciudad nueva ||");
        System.out.println("|   A   | " + nombre + " | " + edad + " | " + ciudad + " | " + promedio + " | " + activo + " | " + ciudadNueva + " |");
        // TODO 7: Colocar un breakpoint antes de la reasignación; observar ciudad,
        // usar Step Over y registrar el valor anterior y el nuevo.

        // --Madrid es el valor anterior y Barcelona es el nuevo valor.
        // --Barcelona es el valor que se muestra en la consola despues de la reasignacion de ciudad  en ciudadNueva.

        // TODO 8: Explicar una elección de tipo y qué garantiza final en CURSO.

        //-- La elección del tipo String para CURSO garantiza que el valor no pueda ser modificado una vez asignado.

    }
}
public class LosDatosCambian {
    public static void main(String[] args) {
        int intentos;
        intentos = 1;
        final String CURSO = "Java";
        var ciudad = "Cucuta";

        System.out.println("Curso: " + CURSO);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Intentos iniciales: " + intentos);

        // Coloca un breakpoint aquí: aún verás intentos con valor 1.
        intentos = 2;
        System.out.println("Intentos actualizados: " + intentos);

        // Activa solo una línea para observar el diagnóstico y vuelve a comentarla.
        // CURSO = "Python";   // final impide reasignar esta variable.
        // ciudad = 25;        // var infirió String; el tipo no cambia.
    }
}

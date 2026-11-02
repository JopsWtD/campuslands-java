package s16demo00;

public final class Numerador {
    private static int siguiente;

    private Numerador() {
    }

    public static synchronized int obtenerSiguiente() {
        return ++siguiente;
    }
}

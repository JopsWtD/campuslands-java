package s16demo00;

import java.util.HashSet;
import java.util.Set;

public class S16Demo00StaticMain {
    public static void main(String[] args) throws InterruptedException {
        int[] numeros = new int[2];
        Runnable[] tareas = new Runnable[2];
        for (int indice = 0; indice < tareas.length; indice++) {
            final int posicion = indice;
            tareas[indice] = new Runnable() {
                @Override
                public void run() {
                    numeros[posicion] = Numerador.obtenerSiguiente();
                }
            };
        }
        EjecutorPrueba.ejecutar(tareas);
        Set<Integer> unicos = new HashSet<>();
        for (int numero : numeros) {
            unicos.add(numero);
        }
        System.out.println("Identificadores distintos: " + unicos.size());
        System.out.println("Monitor: Numerador.class");
        if (unicos.size() != 2) {
            throw new IllegalStateException("Identificadores repetidos");
        }
    }
}

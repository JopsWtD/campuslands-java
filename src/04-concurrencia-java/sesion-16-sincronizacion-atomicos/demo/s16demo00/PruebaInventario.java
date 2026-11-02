package s16demo00;

public final class PruebaInventario {
    private PruebaInventario() {
    }

    public static String ejecutar(Inventario inventario, int vendedores, int intentos,
                                  boolean exigirCoherencia) throws InterruptedException {
        if (vendedores < 1 || vendedores > 16) {
            throw new IllegalArgumentException("Vendedores entre 1 y 16");
        }
        int inicial = inventario.consultarStock();
        Vendedor[] tareas = new Vendedor[vendedores];
        for (int indice = 0; indice < vendedores; indice++) {
            tareas[indice] = new Vendedor(inventario, intentos);
        }
        EjecutorPrueba.ejecutar(tareas);
        int ventas = 0;
        for (Vendedor vendedor : tareas) {
            ventas += vendedor.consultarVentas();
        }
        int finalStock = inventario.consultarStock();
        int totalIntentos = vendedores * intentos;
        boolean coherente = finalStock >= 0 && ventas <= inicial
                && inicial == ventas + finalStock
                && ventas == Math.min(inicial, totalIntentos);
        if (exigirCoherencia && !coherente) {
            throw new IllegalStateException("Inventario incoherente");
        }
        return "stock=" + finalStock + " ventas=" + ventas
                + " rechazos=" + (totalIntentos - ventas) + " coherente=" + coherente;
    }
}

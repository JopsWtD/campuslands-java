package s16demo00;

public class S16Demo00InventarioMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Caso pequeno: esperado stock=98, ventas=2");
        System.out.println("Sin proteger: " + PruebaInventario.ejecutar(
                new InventarioSinSincronizar(100), 2, 1, false));
        System.out.println("Metodo: " + PruebaInventario.ejecutar(
                new InventarioMetodo(100), 2, 1, true));
        System.out.println("Bloque: " + PruebaInventario.ejecutar(
                new InventarioBloque(100), 2, 1, true));
        for (int intento = 1; intento <= 3; intento++) {
            System.out.println("Prueba " + intento + ": esperado stock=6000, ventas=4000");
            System.out.println("Sin proteger: " + PruebaInventario.ejecutar(
                    new InventarioSinSincronizar(10_000), 4, 1_000, false));
            System.out.println("Metodo: " + PruebaInventario.ejecutar(
                    new InventarioMetodo(10_000), 4, 1_000, true));
            System.out.println("Bloque: " + PruebaInventario.ejecutar(
                    new InventarioBloque(10_000), 4, 1_000, true));
        }
        System.out.println("Agotamiento metodo: " + PruebaInventario.ejecutar(
                new InventarioMetodo(100), 2, 80, true));
        System.out.println("Agotamiento bloque: " + PruebaInventario.ejecutar(
                new InventarioBloque(100), 2, 80, true));
    }
}

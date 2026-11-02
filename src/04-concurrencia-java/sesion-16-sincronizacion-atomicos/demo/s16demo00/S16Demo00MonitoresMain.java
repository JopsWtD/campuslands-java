package s16demo00;

import java.util.concurrent.CountDownLatch;

public class S16Demo00MonitoresMain {
    public static void main(String[] args) throws InterruptedException {
        StockCompartido stock = new StockCompartido();
        CountDownLatch leidos = new CountDownLatch(2);
        VentaConMonitorPropio primera = new VentaConMonitorPropio(stock, leidos);
        VentaConMonitorPropio segunda = new VentaConMonitorPropio(stock, leidos);
        System.out.println("Mismo monitor: " + primera.usaMismoMonitor(segunda));
        EjecutorPrueba.ejecutar(new Runnable[]{primera, segunda});
        System.out.println("Intercalacion dirigida: esperado=98 observado="
                + stock.leerSinProteccion());
        if (stock.leerSinProteccion() != 99) {
            throw new IllegalStateException("La reproduccion dirigida no coincide");
        }
        System.out.println("Monitor del inventario: " + PruebaInventario.ejecutar(
                new InventarioBloque(100), 2, 1, true));
    }
}

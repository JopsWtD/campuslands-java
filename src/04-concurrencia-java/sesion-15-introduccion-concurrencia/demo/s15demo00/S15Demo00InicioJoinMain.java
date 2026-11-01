package s15demo00;

public class S15Demo00InicioJoinMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hilo actual: " + Thread.currentThread().getName());
        VerificacionPedido directa = new VerificacionPedido("Directa", 1, 0);
        directa.run();

        Thread inventario = new Thread(
                new VerificacionPedido("Inventario", 2, 20), "inventario");
        Thread direccion = new Thread(
                new VerificacionPedido("Direccion", 2, 20), "direccion");
        System.out.println("Antes de start: " + inventario.getState()
                + " / " + direccion.getState());
        try {
            inventario.start();
            direccion.start();
            inventario.join();
            direccion.join();
            System.out.println("Despues de join: " + inventario.getState()
                    + " / " + direccion.getState());
            System.out.println("Fin: ambas verificaciones terminaron");
        } finally {
            if (inventario.isAlive()) {
                inventario.interrupt();
            }
            if (direccion.isAlive()) {
                direccion.interrupt();
            }
        }
    }
}

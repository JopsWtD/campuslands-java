package labs;

public class S05Lab03ReservaSala {
    public static void main(String[] args) {

        S05ReservaSala reservaAna = new S05ReservaSala("Ana", 2, 15000);
        S05ReservaSala reservaLuis = new S05ReservaSala("Luis", 1, 20000);

        if (reservaAna.extender(1)) {
            System.out.println("Horas actualizadas");
            System.out.println(reservaAna.obtenerHoras());
        }

        if (reservaAna.extender(6)) {
            System.out.println("Horas actualizadas");
            System.out.println(reservaAna.obtenerHoras());
        }

        if (reservaAna.extender(0)) {
            System.out.println("Horas actualizadas");
            System.out.println(reservaAna.obtenerHoras());
        } else {
            System.out.println("No se pudo actualizar las horas porque dio un valor fuera del rango requerido (1-8 horas adicionales)");
        }

        System.out.println("Reserva Ana:");
        System.out.println(reservaAna.obtenerCliente());
        System.out.println(reservaAna.obtenerHoras());
        System.out.println(reservaAna.calcularCosto());
        System.out.println("\nReserva Luis:");
        System.out.println(reservaLuis.obtenerCliente());
        System.out.println(reservaLuis.obtenerHoras());
        System.out.println(reservaLuis.calcularCosto());

    }
}

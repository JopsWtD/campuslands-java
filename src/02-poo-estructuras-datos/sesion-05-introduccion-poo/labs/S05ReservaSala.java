package labs;

public class S05ReservaSala {
    private String cliente;
    private int horas;
    private long tarifaPorHora;

    public S05ReservaSala(String cliente, int horas, long tarifaPorHora) {
        this.cliente = cliente;
        this.horas = horas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public String obtenerCliente() {
        return this.cliente;
    }

    public int obtenerHoras() {
        return this.horas;
    }

    public long calcularCosto() {
        return horas * tarifaPorHora;
    }

    public boolean extender(int horasAdicionales) {
        if (horasAdicionales >= 1 && horasAdicionales <= 8) {
            this.horas += horasAdicionales;
            return true;

        } else {
            return false;
        }
        
    }
}

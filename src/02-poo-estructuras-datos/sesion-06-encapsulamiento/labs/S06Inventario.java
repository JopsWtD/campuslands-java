package labs;

public class S06Inventario {
    private int existencias;
    private final int capacidad = 100;

    public S06Inventario() {
        this.existencias = 0;
    }

    public int getExistencias() {
        return this.existencias;
    }

    public boolean ingresar(int cantidad) {
        if (cantidad > 0) {
            if (this.capacidad - (cantidad + existencias) >= 0) {
                this.existencias += cantidad;
                return true;
            }
        }
        return false;
    }

    public boolean retirar(int cantidad) {
        // TODO 5: Validar cantidad positiva y existencias suficientes antes de restar.
        if (cantidad > 0) {
            if (this.existencias - cantidad >= 0) {
                this.existencias -= cantidad;
                return true;
            }
        }
        return false;
    }
}

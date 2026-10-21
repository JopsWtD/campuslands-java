package labs;

public class S06Pedido {
    private String estado;

    public S06Pedido() {
        this.estado = "PENDIENTE";
    }

    public String getEstado() {
        return this.estado;
    }

    public boolean enviar() {
        // TODO 4: Enviar solo un pedido PENDIENTE; cambiar a ENVIADO y devolver si acepta.
        if (this.estado.equals("PENDIENTE")) {
            this.estado = "ENVIADO";
            return true;
        }
        return false;
    }

    public boolean cancelar() {
        // TODO 5: Cancelar solo un pedido PENDIENTE; cambiar a CANCELADO y devolver si acepta.
        if (this.estado.equals("PENDIENTE")) {
            this.estado = "CANCELADO";
            return true;
        }
        return false;
    }
}

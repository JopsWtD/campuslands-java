package s16demo00;

public final class StockCompartido {
    private int unidades = 100;

    public int leerSinProteccion() {
        return unidades;
    }

    public void escribirSinProteccion(int unidades) {
        this.unidades = unidades;
    }
}

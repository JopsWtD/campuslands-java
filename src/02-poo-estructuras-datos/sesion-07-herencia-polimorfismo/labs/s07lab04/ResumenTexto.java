package s07lab04;

// TODO 2: Implementar Exportable y completar exportar con @Override.
public class ResumenTexto implements Exportable {

    public String exportar(String titulo, int cantidad) {
        return "TEXTO: Título: " + titulo + " | Cantidad: " + cantidad;
    }
}

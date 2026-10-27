package s07lab04;

public class S07Lab04InterfacesMain {
    public static void mostrarExportacion(Exportable formato) {
        System.out.println(formato.exportar("Asistencia", 12));
    }

    public static void main(String[] args) {
        // TODO 5: Llamar al mismo cliente con un ResumenTexto y un ResumenCsv.
        ResumenTexto resumenTexto = new ResumenTexto();
        ResumenCsv resumenCsv = new ResumenCsv();
        mostrarExportacion(resumenTexto);
        mostrarExportacion(resumenCsv);
    }
}

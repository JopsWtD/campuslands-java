package s17demo02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class S17Demo02LecturaMain {
    public static void main(String[] args) throws IOException {
        Path base = Path.of("src", "05-persistencia-datos",
                "sesion-17-manejo-archivos", "demo", "s17demo02", "datos");

        System.out.println("Datos: " + base.toAbsolutePath());
        Files.createDirectories(base);
        Path archivo = base.resolve("pedidos.txt");
        // Cambia a false para probar la lectura sin crear la muestra.
        boolean prepararMuestra = true;
        if (prepararMuestra) {
            try {
                Files.writeString(archivo,
                        "P-001;Ana;PENDIENTE\nP-002;Luis;ENTREGADO\nP-003;María\nP-004;Sara;OTRO\n",
                        StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
            } catch (FileAlreadyExistsException error) {
                System.out.println("Entrada existente conservada");
            }
        }
        if (!Files.isRegularFile(archivo)) {
            throw new IOException("No existe un archivo regular de pedidos: " + archivo);
        }
        int validos = 0;
        int invalidos = 0;
        int numero = 0;
        try (BufferedReader lector = Files.newBufferedReader(archivo, StandardCharsets.UTF_8)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                numero++;
                if (linea.isBlank()) {
                    continue;
                }
                try {
                    String[] campos = linea.split(";", -1);
                    if (campos.length != 3) {
                        throw new IllegalArgumentException("Se requieren tres campos");
                    }
                    Pedido pedido = new Pedido(campos[0].strip(), campos[1].strip(), campos[2].strip());
                    System.out.println("Valido: " + pedido.descripcion());
                    validos++;
                } catch (IllegalArgumentException error) {
                    System.out.println("Linea " + numero + ": " + error.getMessage());
                    invalidos++;
                }
            }
        }
        System.out.println("Validos: " + validos + "; invalidos: " + invalidos);
    }
}

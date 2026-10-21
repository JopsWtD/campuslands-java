package labs;

public class S05Lab01PrestamoLibro {
    public static void main(String[] args) {

        S05LibroPrestamo primerLibro = new S05LibroPrestamo("El principito");
        S05LibroPrestamo segundoLibro = new S05LibroPrestamo("Matilda");

        System.out.println(primerLibro.obtenerTitulo());
        primerLibro.prestar();
        primerLibro.prestar();
        System.out.println(primerLibro.estaPrestado());

        primerLibro.devolver();
        System.out.println(primerLibro.estaPrestado());
        System.out.println(segundoLibro.estaPrestado());
    }
}

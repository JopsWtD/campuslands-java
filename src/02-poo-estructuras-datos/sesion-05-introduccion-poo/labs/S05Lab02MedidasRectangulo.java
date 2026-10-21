package labs;

public class S05Lab02MedidasRectangulo {
    public static void main(String[] args) {

        S05Rectangulo primeraFigura = new S05Rectangulo(5,3);
        S05Rectangulo segundaFigura = new S05Rectangulo(4,4);

        System.out.println("Primera figura: ");
        System.out.println(primeraFigura.calcularArea());
        System.out.println(primeraFigura.calcularPerimetro());
        System.out.println(primeraFigura.esCuadrado());

        System.out.println("\nSegunda figura: ");
        System.out.println(segundaFigura.calcularArea());
        System.out.println(segundaFigura.calcularPerimetro());
        System.out.println(segundaFigura.esCuadrado());
    }
}

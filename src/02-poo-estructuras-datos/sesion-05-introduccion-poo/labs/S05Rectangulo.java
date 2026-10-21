package labs;

public class S05Rectangulo {
    private double base;
    private double altura;

    public S05Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base*altura;
    }

    public double calcularPerimetro() {
        return 2.0*(base+altura);
    }

    public boolean esCuadrado() {
        return base == altura;
    }
}

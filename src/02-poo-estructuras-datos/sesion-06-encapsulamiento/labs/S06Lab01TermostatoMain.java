package labs;

public class S06Lab01TermostatoMain {
    public static void main(String[] args) {
        // TODO 5: Crear un termostato y mostrar su temperatura inicial.
        S06Termostato termostato = new S06Termostato();
        // TODO 6: Solicitar 24, 31 y 16; mostrar cada resultado y la temperatura posterior.
        System.out.println(termostato.ajustarTemperatura(24));
        System.out.println(termostato.getTemperaturaObjetivo());
        System.out.println(termostato.ajustarTemperatura(31));
        System.out.println(termostato.getTemperaturaObjetivo());
        System.out.println(termostato.ajustarTemperatura(16));
        System.out.println(termostato.getTemperaturaObjetivo());
    }
}

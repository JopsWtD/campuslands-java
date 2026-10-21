package labs;

public class S06Termostato {
    private int temperaturaObjetivo;

    public S06Termostato() {
        this.temperaturaObjetivo = 20;
    }

    public int getTemperaturaObjetivo() {
        return temperaturaObjetivo;
    }

    public boolean ajustarTemperatura(int nuevaTemperatura) {
        if (nuevaTemperatura >= 16 && nuevaTemperatura <= 30) {
            this.temperaturaObjetivo = nuevaTemperatura;
            return true;
        } else {
            return false;
        }
    }
}

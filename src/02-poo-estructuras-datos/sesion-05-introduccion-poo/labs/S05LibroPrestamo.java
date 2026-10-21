package labs;

public class S05LibroPrestamo {
    private String titulo;
    private boolean prestado;

    public S05LibroPrestamo(String titulo) {
        this.titulo = titulo;
        this.prestado = false;
    }

    public String obtenerTitulo() {
        // TODO 3: Devolver el titulo del objeto.
        return this.titulo;
    }

    public boolean prestar() {
        if (prestado) {
            System.out.println("Tu prestamo fue rechazado porque el libro ya fue prestado.");
            return false;
        }
        else {
            System.out.println("Tu prestamo para el libro ("+this.titulo+") fue aceptado");
            this.prestado = true;
            return true;
        }
    }

    public void devolver() {
        if (prestado) {
            System.out.println("El libro "+this.titulo+" fue devuelto con éxito.");
            this.prestado = false;
        }
        else {
            System.out.println("El libro ("+this.titulo+") no se pudo devolver porque nunca estuvo prestado.");
        }
    }

    public boolean estaPrestado() {
        return this.prestado;
    }
}

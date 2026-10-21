package labs;

public class S06Lab02InventarioMain {
    public static void main(String[] args) {

        S06Inventario inventario = new S06Inventario();

        System.out.println(inventario.ingresar(10));
        System.out.println(inventario.getExistencias());
        System.out.println(inventario.retirar(11));
        System.out.println(inventario.getExistencias());
        System.out.println(inventario.retirar(10));
        System.out.println(inventario.getExistencias());

        System.out.println(inventario.ingresar(0));
        System.out.println(inventario.getExistencias());
        System.out.println(inventario.ingresar(101));
        System.out.println(inventario.getExistencias());
    }
}

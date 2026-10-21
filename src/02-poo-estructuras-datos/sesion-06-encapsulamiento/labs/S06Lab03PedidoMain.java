package labs;

public class S06Lab03PedidoMain {
    public static void main(String[] args) {
        // TODO 6: Crear primerPedido y segundoPedido; mostrar el estado inicial de ambos.
        S06Pedido primerPedido = new S06Pedido();
        S06Pedido segundoPedido = new S06Pedido();

        System.out.println(primerPedido.getEstado());
        System.out.println(segundoPedido.getEstado());
        // TODO 7: Enviar primerPedido y luego intentar cancelarlo; consultar tras cada accion.
        System.out.println(primerPedido.enviar());
        System.out.println(primerPedido.getEstado());
        System.out.println(primerPedido.cancelar());
        System.out.println(primerPedido.getEstado());
        // TODO 8: Cancelar segundoPedido y luego intentar enviarlo; consultar tras cada accion.
        System.out.println(segundoPedido.cancelar());
        System.out.println(segundoPedido.getEstado());
        System.out.println(segundoPedido.enviar());
        System.out.println(segundoPedido.getEstado());
    }
}

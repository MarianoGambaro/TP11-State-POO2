package pt4;

public class Main {
    static void main() {
        OrdenDeCompra orden = new OrdenDeCompra();
        System.out.println("Estado actual: " + orden.estado());

        //agrego productos
        orden.agregarProducto(new Producto("Notebook", 750000));
        orden.agregarProducto(new Producto("Mouse", 40000));
        System.out.println("Cantidad de productos: " + orden.productos().size());

        //confirmo
        orden.confirmarCompra();
        System.out.println("Monto total calculado: $" + orden.monto());
        System.out.println("Estado actual: " + orden.estado());

        //intento agregar producto
        System.out.println("intento agregar producto estando EN PREPARACIÓN");
        try {
            orden.agregarProducto(new Producto("Teclado", 80000));
        } catch (IllegalStateException e) {
            System.out.println("Bloqueado con éxito: " + e.getMessage());
        }

        //envio la orden
        orden.enviar();
        System.out.println("Orden Enviada ---");
        System.out.println("Número de Seguimiento: " + orden.numeroSeguimiento());
        System.out.println("Estado actual: " + orden.estado());
    }
}

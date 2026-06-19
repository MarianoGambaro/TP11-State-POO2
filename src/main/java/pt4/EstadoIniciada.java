package pt4;

public class EstadoIniciada implements EstadoOrden {
    static final String MSG_ERROR_SIN_PRODUCTOS = "La orden debe tener al menos un producto";
    static final String MSG_ERROR_ENVIAR = "La orden solo puede enviarse desde en preparacion";

    @Override
    public void agregarProducto(OrdenDeCompra orden, Producto producto) {
        orden.productos().add(producto);
    }

    @Override
    public void confirmarCompra(OrdenDeCompra orden) {
        if (orden.productos().isEmpty()) {
            throw new IllegalStateException(MSG_ERROR_SIN_PRODUCTOS);
        }
        orden.nuevoMonto(orden.calcularMonto());
        orden.nuevoEstado(new EstadoEnPreparacion());
    }

    @Override
    public void enviar(OrdenDeCompra orden) {
        throw new IllegalStateException(MSG_ERROR_ENVIAR);
    }

    @Override
    public void cancelar(OrdenDeCompra orden) {
        orden.nuevoEstado(new EstadoCancelada());
    }

    public String toString() {
        return "Iniciada";
    }
}

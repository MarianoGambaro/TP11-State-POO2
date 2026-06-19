package pt4;

public class EstadoEnPreparacion implements EstadoOrden {
    static final String MSG_ERROR_AGREGAR_PRODUCTO = "No se pueden agregar productos en este estado";
    static final String MSG_ERROR_CONFIRMAR = "La orden ya estaba confirmada";

    @Override
    public void agregarProducto(OrdenDeCompra orden, Producto producto) {
        throw new IllegalStateException(MSG_ERROR_AGREGAR_PRODUCTO);
    }

    @Override
    public void confirmarCompra(OrdenDeCompra orden) {
        throw new IllegalStateException(MSG_ERROR_CONFIRMAR);
    }

    @Override
    public void enviar(OrdenDeCompra orden) {
        orden.agregarNumeroSeguimiento(orden.generarNumeroSeguimiento());
        orden.nuevoEstado(new EstadoEnviada());
    }

    @Override
    public void cancelar(OrdenDeCompra orden) {
        orden.nuevoEstado(new EstadoCancelada());
    }

    public String toString() {
        return "En preparación";
    }
}

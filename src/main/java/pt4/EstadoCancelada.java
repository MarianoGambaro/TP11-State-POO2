package pt4;

public class EstadoCancelada implements EstadoOrden {
    static final String MSG_ERROR_AGREGAR_PRODUCTO = "No se pueden agregar productos en este estado";
    static final String MSG_ERROR = "La orden ya ha sido cancelada.";


    @Override
    public void agregarProducto(OrdenDeCompra orden, Producto producto) {
        throw new IllegalStateException(MSG_ERROR_AGREGAR_PRODUCTO);
    }

    @Override
    public void confirmarCompra(OrdenDeCompra orden) {
        throw new IllegalStateException(MSG_ERROR);
    }

    @Override
    public void enviar(OrdenDeCompra orden) {
        throw new IllegalStateException(MSG_ERROR);
    }

    @Override
    public void cancelar(OrdenDeCompra orden) {
        throw new IllegalStateException(MSG_ERROR);
    }

    public String toString() {
        return "Cancelada";
    }
}

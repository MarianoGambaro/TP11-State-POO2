package pt4;

public class EstadoEnviada implements EstadoOrden {
    private static final String MSG_ERROR = "La orden ya ha sido enviada";

    @Override
    public void agregarProducto(OrdenDeCompra orden, Producto producto) {
        throw new IllegalStateException(MSG_ERROR);
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
        return "Enviada";
    }
}

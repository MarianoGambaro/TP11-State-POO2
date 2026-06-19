package pt4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenDeCompraTest {

    @Test
    public void confirmarCompraSinProductos() {
        //setup
        var orden = new OrdenDeCompra();
        //ejec
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            orden.confirmarCompra();
        });
        //verif
        assertEquals("La orden debe tener al menos un producto", exception.getMessage());
    }

    @Test
    public void testFlujoCompletoExitoso() {
        //setup
        var orden = new OrdenDeCompra();
        var producto = new Producto("Teclado", 150.0);
        //ejec y verif
        orden.agregarProducto(producto);
        assertTrue(orden.estado() instanceof EstadoIniciada);

        orden.confirmarCompra();
        assertTrue(orden.estado() instanceof EstadoEnPreparacion);
        assertEquals(150.0, orden.monto());

        orden.enviar();
        assertTrue(orden.estado() instanceof EstadoEnviada);
        assertNotNull(orden.numeroSeguimiento());
    }

    @Test
    public void testNoSePuedenAgregarProductosEnPreparacion() {
        //setup
        var orden = new OrdenDeCompra();
        orden.agregarProducto(new Producto("Mouse", 50.0));
        orden.confirmarCompra();
        //verif
        //debera fallar si intento agregar otro producto ahora
        assertThrows(IllegalStateException.class, () -> {
            orden.agregarProducto(new Producto("Monitor", 300.0));
        });
    }

    @Test
    public void testNoSePuedeEnviarDesdeIniciada() {
        //seutup
        var orden = new OrdenDeCompra();
        orden.agregarProducto(new Producto("Mouse", 50.0));
        //verif
        assertThrows(IllegalStateException.class, () -> {
            orden.enviar();
        });
    }
}
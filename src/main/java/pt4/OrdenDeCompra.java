package pt4;

import java.util.ArrayList;
import java.util.List;

public class OrdenDeCompra {

    private List<Producto> productos;
    private double monto;
    private String numeroSeguimiento;
    private EstadoOrden estadoActual;

    public OrdenDeCompra() {
        this.estadoActual = new EstadoIniciada();
        this.productos = new ArrayList<>();
        this.monto = 0;
        this.numeroSeguimiento = null;
    }

    public void agregarProducto(Producto producto) {
        estadoActual.agregarProducto(this, producto);
    }

    public void confirmarCompra() {
        estadoActual.confirmarCompra(this);
    }

    public void enviar() {
        estadoActual.enviar(this);
    }

    public void cancelar() {
        estadoActual.cancelar(this);
    }

    public EstadoOrden estado() {
        return this.estadoActual;
    }

    public double monto() {
        return this.monto;
    }

    public String numeroSeguimiento() {
        return this.numeroSeguimiento;
    }

    public List<Producto> productos() {
        return this.productos;
    }

    public double calcularMonto() {
        return this.productos.stream().mapToDouble(Producto::precio).sum();
    }

    public void nuevoMonto(double nuevoMonto) {
        this.monto = nuevoMonto;
    }

    public void nuevoEstado(EstadoOrden nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public String generarNumeroSeguimiento() {
        return "SEG-" + System.currentTimeMillis();
    }

    public void agregarNumeroSeguimiento(String s) {
        this.numeroSeguimiento = s;
    }
}

package pt2;

public class Calculadora {
    static final double VALOR_INICIAL = 0.0;
    private double valorAcumulado;
    private EstadoCalculadora estadoActual;

    public Calculadora() {
        this.estadoActual = new EstadoInicial();
        this.valorAcumulado = VALOR_INICIAL;
    }

    public EstadoCalculadora estado() {
        return this.estadoActual;
    }

    public void mas() {
        estadoActual.mas(this);
    }

    public void menos() {
        estadoActual.menos(this);
    }

    public void dividido() {
        estadoActual.dividido(this);
    }

    public void multiplicado() {
        estadoActual.por(this);
    }

    public void borrar() {
        estadoActual.borrar(this);
    }

    public void valor(double valor) {
        estadoActual.valor(this, valor);
    }

    public String mostrar() {
        return estadoActual.mostrar(this);
    }

    public void nuevoEstado(EstadoCalculadora nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public double valorAcumulado() {
        return valorAcumulado;
    }

    public void nuevoValorAcumulado(double valor) {
        this.valorAcumulado = valor;
    }


}
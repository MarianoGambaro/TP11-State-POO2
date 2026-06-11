package pt1;

public class Puerta {

    private Estado estado = Estado.CERRADA;
    private EstadoPuerta state;

    public Puerta() {
        this.state = new PuertaCerrada(this);
    }

    public Estado estado() {
        return this.estado;
    }

    public void abrir() {
        this.state.abrir();
    }

    public void cerrar() {
        this.state.cerrar();
    }

    public void nuevoEstado(Estado estado) {
        this.estado = estado;
    }
}

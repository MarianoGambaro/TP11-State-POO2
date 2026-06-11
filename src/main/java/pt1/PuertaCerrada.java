package pt1;

public class PuertaCerrada implements EstadoPuerta {

    private Puerta puerta;

    public PuertaCerrada(Puerta puerta) {
        this.puerta = puerta;
    }

    @Override
    public void abrir() {
        puerta.nuevoEstado(Estado.ABIERTA);
        System.out.println("Abriendo puerta");

    }

    @Override
    public void cerrar() {
        System.out.println("No se puede cerrar una puerta cerrada");
    }
}

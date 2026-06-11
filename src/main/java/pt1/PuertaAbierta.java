package pt1;


public class PuertaAbierta implements EstadoPuerta {

    private Puerta puerta;

    public PuertaAbierta(Puerta puerta) {
        this.puerta = puerta;
    }


    @Override
    public void abrir() {
        System.out.println("No se puede abrir una puerta abierta.");
    }

    @Override
    public void cerrar() {
        puerta.nuevoEstado(Estado.CERRADA);
        System.out.println("Cerrando puerta");
    }
}

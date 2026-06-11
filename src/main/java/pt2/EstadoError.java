package pt2;

public class EstadoError implements EstadoCalculadora {

    private static final String MSG_ESTADO_ERROR = "La calculadora está en estado de error";

    @Override
    public void borrar(Calculadora calc) {
        calc.nuevoValorAcumulado(0.0);
        calc.nuevoEstado(new EstadoInicial());
    }

    @Override
    public String mostrar(Calculadora calc) {
        return MSG_ESTADO_ERROR;
    }

    @Override
    public void mas(Calculadora calc) {

    }

    @Override
    public void menos(Calculadora calc) {

    }

    @Override
    public void por(Calculadora calc) {

    }

    @Override
    public void dividido(Calculadora calc) {

    }

    @Override
    public void valor(Calculadora calc, double unValor) {

    }

    @Override
    public String toString() {
        return MSG_ESTADO_ERROR;
    }

}

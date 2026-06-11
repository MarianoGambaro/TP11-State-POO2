package pt2;

public class EstadoEsperandoResta implements EstadoCalculadora {
    @Override
    public void valor(Calculadora calc, double unValor) {
        calc.nuevoValorAcumulado(calc.valorAcumulado() - unValor);
        calc.nuevoEstado(new EstadoInicial());
    }

    @Override
    public void borrar(Calculadora calc) {
        calc.nuevoValorAcumulado(0.0);
        calc.nuevoEstado(new EstadoInicial());
    }

    //cualquier otra tecla que se toque mientras se espera el valor dispara un error
    @Override
    public void mas(Calculadora calc) {
        calc.nuevoEstado(new EstadoError());
    }

    @Override
    public void menos(Calculadora calc) {
        calc.nuevoEstado(new EstadoError());
    }

    @Override
    public void por(Calculadora calc) {
        calc.nuevoEstado(new EstadoError());
    }

    @Override
    public void dividido(Calculadora calc) {
        calc.nuevoEstado(new EstadoError());
    }


    @Override
    public String mostrar(Calculadora calc) {
        calc.nuevoEstado(new EstadoError());
        return "La calculadora está en estado de error";
    }

    @Override
    public String toString() {
        return "ESTADO: Esperando Operando (Resta)";
    }
}
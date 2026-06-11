package pt2;

public class EstadoInicial implements EstadoCalculadora {

    @Override
    public void valor(Calculadora calc, double unValor) {
        calc.nuevoValorAcumulado(unValor);
    }

    @Override
    public String mostrar(Calculadora calc) {
        return String.valueOf(calc.valorAcumulado());
    }

    @Override
    public void mas(Calculadora calc) {
        calc.nuevoEstado(new EstadoEsperandoSuma());
    }

    @Override
    public void menos(Calculadora calc) {
        calc.nuevoEstado(new EstadoEsperandoResta());
    }

    @Override
    public void por(Calculadora calc) {
        calc.nuevoEstado(new EstadoEsperandoMultiplicacion());
    }

    @Override
    public void dividido(Calculadora calc) {
        calc.nuevoEstado(new EstadoEsperandoDivision());
    }


    @Override
    public void borrar(Calculadora calc) {
        calc.nuevoValorAcumulado(0.0);
    }


    @Override
    public String toString() {
        return "ESTADO: Inicial";
    }
}

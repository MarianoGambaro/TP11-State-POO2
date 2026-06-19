package pt3;

public class EstadoNormal implements EstadoGolondrina {
    @Override
    public void realizarDeseo(Golondrina golondrina) {
        //en este caso no hay nada especificado para el estado normal, imprimo un mensaje
        System.out.println("La golondrina no tiene deseos. ");
    }

    @Override
    public String toString() {
        return "Normal";
    }
}

package pt3;

public class EstadoDebil implements EstadoGolondrina {

    //Cuando se sienten débiles, su deseo es
    //comer (con 50 gramos de comida es suficiente) para recuperar energía y estar en condiciones de volar
    @Override
    public void realizarDeseo(Golondrina golondrina) {
        golondrina.comer(50);
    }

    @Override
    public String toString() {
        return "Débil";
    }
}

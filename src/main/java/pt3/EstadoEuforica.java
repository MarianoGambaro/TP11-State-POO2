package pt3;

public class EstadoEuforica implements EstadoGolondrina {

    //Cuando se sienten eufóricas, su deseo es volar 5
    //kilómetros, como un paseo, y volver a su lugar de origen.
    @Override
    public void realizarDeseo(Golondrina golondrina) {
        golondrina.volar(5 + 5); //5km ida y 5km vuelta
    }

    @Override
    public String toString() {
        return "Eufórica";
    }
}

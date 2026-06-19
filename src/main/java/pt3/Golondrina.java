package pt3;

public class Golondrina {
    public static final int ENERGIA_INICIAL = 45;
    private int energia; //joules

    public Golondrina() {
        this.energia = ENERGIA_INICIAL;
    }

    public EstadoGolondrina estadoActual() {
        if (this.energia < 50) {
            return new EstadoDebil();
        }
        if (this.energia > 500) {
            return new EstadoEuforica();
        }
        return new EstadoNormal();
    }

    public void comer(int gramos) {
        this.energia += (5 * gramos);
    }

    public void volar(int kms) {
        this.energia -= (kms + 10);
    }

    public void realizarDeseo() {
        this.estadoActual().realizarDeseo(this);
    }

    public int energia() {
        return this.energia;
    }
}

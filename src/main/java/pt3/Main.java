package pt3;

public class Main {
    static void main() {
        Golondrina g = new Golondrina(); //nace con 45 joules(debil)

        System.out.println("Energia inicial: " + g.energia());
        System.out.println("Estado inicial: " + g.estadoActual());

        System.out.println("Intenta realizar deseo estando Débil");
        g.realizarDeseo(); // ddeberia comer 50g -> energía sube a 45 + 250 = 295 (pasa a normal)
        System.out.println("Energia: " + g.energia());
        System.out.println("Estado actual: " + g.estadoActual());

        System.out.println("Intenta realizar deseo estando Normal");
        g.realizarDeseo(); //estado normal, no tiene deseos definidos.
        System.out.println("Energia: " + g.energia());
        System.out.println("Estado actual: " + g.estadoActual());

        System.out.println("Le damos mucha comida para ponerla Eufórica");
        g.comer(60); // 295 + 300 = 595 Joules (> 500 pasa a Euforica)
        System.out.println("Energia: " + g.energia());
        System.out.println("Estado actual: " + g.estadoActual());

        System.out.println("Realiza deseo estando Eufórica");
        g.realizarDeseo(); //vuela 10km -> Consume (10 + 10) = 20 Joules, queda en 575
        System.out.println("Energia: " + g.energia());
        System.out.println("Estado actual: " + g.estadoActual());
    }
}

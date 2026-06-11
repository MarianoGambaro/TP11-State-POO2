package pt2;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== PRUEBA 1: SUMA Y MULTIPLICACIÓN");
        System.out.println(calc.estado() + " | Valor: " + calc.mostrar());

        System.out.println("\n--- Ingresamos el primer valor (10) ---");
        calc.valor(10);
        System.out.println(calc.estado() + " | Valor: " + calc.mostrar());

        System.out.println("\n--- Presionamos MÁS ---");
        calc.mas();
        System.out.println(calc.estado());

        System.out.println("\n--- Ingresamos el segundo valor (5) ---");
        calc.valor(5); //sumar 10 + 5 y volver a Inicial
        System.out.println(calc.estado() + " | Valor: " + calc.mostrar());

        System.out.println("\n--- Presionamos MULTIPLICADO ---");
        calc.multiplicado();
        System.out.println(calc.estado());

        System.out.println("\n--- Ingresamos el multiplicador (2) ---");
        calc.valor(2); // hacer 15 * 2 = 30 y volver a Inicial
        System.out.println(calc.estado() + " | Valor: " + calc.mostrar());


        System.out.println("\n=== PRUEBA 2: ENTRAR EN ESTADO DE ERROR (DOS OPERACIONES) ===");
        System.out.println("\n--- Presionamos MENOS ---");
        calc.menos();
        System.out.println(calc.estado());

        System.out.println("\n--- Presionamos MÁS (error) ---");
        calc.mas();
        System.out.println(calc.estado());
        System.out.println("mostrar en error: " + calc.mostrar());

        System.out.println("\n--- Intenta meter un valor estando en error ---");
        calc.valor(50);
        System.out.println(calc.estado() + " | Valor: " + calc.mostrar());


        System.out.println("\n=== PRUEBA 3: SALIR DEL ERROR CON BORRAR ===");
        System.out.println("\n--- Presionamos BORRAR ---");
        calc.borrar();
        System.out.println(calc.estado() + " | Valor: " + calc.mostrar());


        System.out.println("\n=== PRUEBA 4: DIVISION POR CERO ===");
        System.out.println("\n--- Cargamos un 20 ---");
        calc.valor(20);
        System.out.println("\n--- Presionamos DIVIDIDO ---");
        calc.dividido();
        System.out.println(calc.estado());

        System.out.println("\n--- Ingresamos un 0 ---");
        calc.valor(0); //deberia salir error
        System.out.println(calc.estado());
        System.out.println("Valor actual: " + calc.mostrar());

        System.out.println("\n--- Reseteamos final ---");
        calc.borrar();
        System.out.println(calc.estado() + " | Valor: " + calc.mostrar());
    }
}
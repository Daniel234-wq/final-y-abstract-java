package laboratorio1;

public class Laboratorio1Main {
    public static void main(String[] args) {
        System.out.println("=== LABORATORIO 1: LA TARJETA DE IDENTIFICACION ===");

        // Creacion de la tarjeta con numero, titular y saldo inicial
        Tarjeta tarjeta = new Tarjeta("4500-1234-5678-9012", "Maria Rodriguez", 1500.0);

        System.out.println("\n--- Estado Inicial ---");
        tarjeta.mostrarInformacion();

        System.out.println("\n--- Operacion de Deposito ---");
        tarjeta.depositar(350.50);

        System.out.println("\n--- Estado Final ---");
        tarjeta.mostrarInformacion();

        System.out.println("\n--- Analisis del Reto Extra ---");
        System.out.println("Las propiedades 'numero' y 'titular' estan protegidas por 'final'.");
        System.out.println("Intentar reasignar 'numero' produce el error en tiempo de compilacion:");
        System.out.println("'cannot assign a value to final variable numero'");
        System.out.println("El saldo varia legitimamente mediante el metodo depositar().");
    }
}

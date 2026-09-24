package laboratorio2;

public class Laboratorio2Main {
    public static void main(String[] args) {
        System.out.println("=== LABORATORIO 2: EL ZOOLOGICO ===");

        // 5. En el main, crea un arreglo Animal[] con los tres y recorrelo llamando a presentarse().
        AnimalZoologico[] zoologico = {
            new PerroZoologico("Firulais"),
            new GatoZoologico("Michi"),
            new VacaZoologico("Lola"),
            new PezSolucion1("Nemo") // Solucion 1 del pez
        };

        System.out.println("\n--- Presentacion de Animales (Polimorfismo) ---");
        for (AnimalZoologico animal : zoologico) {
            animal.presentarse();
        }

        System.out.println("\n--- Analisis del Reto Extra (Pez) ---");
        System.out.println("Si una clase concreta 'Pez' no implementa 'emitirSonido()', el compilador genera el error:");
        System.out.println("'Pez is not abstract and does not override abstract method emitirSonido() in AnimalZoologico'");
        System.out.println("Las dos soluciones posibles son:");
        System.out.println("1. Implementar el metodo abstracto en Pez (ver PezSolucion1.java).");
        System.out.println("2. Declarar la clase Pez como 'abstract' (ver PezSolucion2.java).");
    }
}

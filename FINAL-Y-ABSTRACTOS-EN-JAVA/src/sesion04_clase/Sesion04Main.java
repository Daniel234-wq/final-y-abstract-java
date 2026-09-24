package sesion04_clase;

public class Sesion04Main {
    public static void main(String[] args) {
        System.out.println("=== SESION 04: FINAL EN CLASES Y CLASES SELLADAS (SEALED) ===");

        // 1. ConfiguracionSistema (final class)
        ConfiguracionSistema config = new ConfiguracionSistema("https://servidor.produccion.com", 60);
        System.out.println("Version del sistema: " + config.obtenerVersion());
        System.out.println("Servidor configurado: " + config.getUrlServidor());
        System.out.println("Timeout: " + config.getTimeoutSegundos() + "s");

        // 2. Jerarquia sellada (sealed)
        Vehiculo v1 = new Carro("ABC-123", 4);
        Vehiculo v2 = new Moto("XYZ-789", 600);

        v1.conducir();
        v2.conducir();

        // 3. Punto de control resuelto:
        // Pregunta: Puede una clase final heredar de otra clase?
        System.out.println("\n--- Punto de Control ---");
        System.out.println("Pregunta: Puede una clase final heredar de otra clase?");
        System.out.println("Respuesta: SI. Por ejemplo, 'Carro' es una clase 'final' y hereda de 'Vehiculo'.");
        System.out.println("Lo que 'final' impide es que otras clases hereden de ella (hacia abajo), pero puede heredar de un padre (hacia arriba).");
    }
}

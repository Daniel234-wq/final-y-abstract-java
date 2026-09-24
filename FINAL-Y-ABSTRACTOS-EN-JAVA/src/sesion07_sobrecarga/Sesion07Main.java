package sesion07_sobrecarga;

public class Sesion07Main {
    public static void main(String[] args) {
        System.out.println("=== SESION 07: SOBRECARGA DE METODOS ABSTRACTOS ===");

        Reporte reporte = new ReportePDF();

        System.out.println("\n--- Invocacion de la sobrecarga sin argumentos ---");
        reporte.generar();

        System.out.println("\n--- Invocacion de la sobrecarga con titulo ---");
        reporte.generar("Ventas Trimestrales");

        System.out.println("\n--- Invocacion de la sobrecarga completa (titulo y paginas) ---");
        reporte.generar("Ventas 2026", 12);

        System.out.println("\n--- Punto de Control ---");
        System.out.println("Pregunta: Si la clase abstracta declara 3 versiones sobrecargadas y la hija implementa solo 2, compila?");
        System.out.println("Respuesta: NO compila. Cada metodo sobrecargado es un contrato abstracto individual.");
        System.out.println("La clase concreta debe implementar todas las versiones obligatoriamente para ser instanciable.");
    }
}

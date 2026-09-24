package sesion06_metodos_abstractos;

public class Sesion06Main {
    public static void main(String[] args) {
        System.out.println("=== SESION 06: METODOS ABSTRACTOS Y POLIMORFISMO ===");

        // Arreglo polimorfico de figuras abstractas con instancias concretas
        Figura[] figuras = {
            new Cuadrado(4),
            new CirculoFigura(2)
        };

        // Cada figura responde a su manera ejecutando su propia implementacion de calcularArea()
        for (Figura f : figuras) {
            f.describir();
        }

        // Punto de control de la sesion
        System.out.println("\n--- Punto de Control ---");
        System.out.println("Pregunta: Por que 'abstract final void metodo();' nunca compila?");
        System.out.println("Respuesta: Porque 'abstract' exige que una subclase implemente el metodo obligatoriamente,");
        System.out.println("mientras que 'final' prohibe que cualquier subclase lo sobrescriba.");
        System.out.println("Ambas palabras claves son mutuamente excluyentes y contradictorias.");
    }
}

package sesion05_abstractas;

public class Sesion05Main {
    public static void main(String[] args) {
        System.out.println("=== SESION 05: CLASES ABSTRACTAS Y CONSTRUCTORES ===");

        // No se puede instanciar Animal directamente:
        // Animal a = new Animal("Generico"); // ERROR: Animal is abstract; cannot be instantiated

        // Polimorfismo: variable de tipo abstracto Animal con instancia concreta Perro
        Animal a = new Perro("Firulais");
        System.out.print("Llamada al metodo heredado dormir(): ");
        a.dormir();

        Perro p = new Perro("Max");
        p.dormir();
        p.ladrar();
    }
}

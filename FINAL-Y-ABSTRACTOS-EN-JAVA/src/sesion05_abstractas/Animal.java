package sesion05_abstractas;

// Una clase abstracta no se puede instanciar directamente con 'new Animal(...)'.
public abstract class Animal {
    // Puede contener propiedades normales e incluso 'final'.
    protected final String nombre;

    // Constructor utilizado por las subclases a traves de 'super(nombre)'.
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Metodo concreto con implementacion completa heredada por todas las hijas.
    public void dormir() {
        System.out.println(nombre + " duerme.");
    }

    public String getNombre() {
        return nombre;
    }

    /*
     * Intento directo de instanciacion:
     * Animal a = new Animal("Generico");
     *
     * Error del compilador:
     * "Animal is abstract; cannot be instantiated"
     */
}


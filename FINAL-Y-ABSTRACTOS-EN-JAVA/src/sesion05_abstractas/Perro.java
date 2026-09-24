package sesion05_abstractas;

// Clase concreta que hereda de la clase abstracta Animal.
public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    public void ladrar() {
        System.out.println(nombre + " dice: Guau guau!");
    }
}

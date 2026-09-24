package sesion06_metodos_abstractos;

public abstract class Figura {
    // Metodo abstracto: sin cuerpo {}.
    // Figura no sabe como calcular el area porque depende de la forma geometrica especifica.
    public abstract double calcularArea();

    // Metodo concreto que invoca al metodo abstracto calcularArea().
    // En tiempo de ejecucion el polimorfismo resolvera la implementacion real de la subclase.
    public void describir() {
        System.out.println("Area: " + calcularArea());
    }
}

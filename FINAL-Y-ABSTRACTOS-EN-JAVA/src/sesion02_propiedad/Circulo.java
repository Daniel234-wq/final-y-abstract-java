package sesion02_propiedad;

public class Circulo {
    // static final: constante compartida por todas las instancias de la clase.
    public static final double PI = 3.14159;

    // radio es final pero no static: cada circulo tiene su propio valor y no cambia tras ser creado.
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Calcula y retorna el area del circulo usando la constante PI y el radio sellado.
    public double area() {
        return PI * radio * radio;
    }

    public double getRadio() {
        return radio;
    }
}

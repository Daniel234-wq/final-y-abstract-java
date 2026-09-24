package laboratorio2;

/*
 * RETO EXTRA - FORMA 2 DE ARREGLO:
 * Declarar la clase hija tambien como abstracta ('public abstract class').
 * De este modo, no esta obligada a implementar el metodo abstracto en este nivel,
 * sino que delega esa obligacion a sus subclases concretas (por ejemplo: Tiburon o Trucha).
 */
public abstract class PezSolucion2 extends AnimalZoologico {

    public PezSolucion2(String nombre) {
        super(nombre);
    }

    // No implementa emitirSonido() aqui, ya que la clase es abstracta.
}

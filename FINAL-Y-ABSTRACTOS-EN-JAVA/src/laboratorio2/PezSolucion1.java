package laboratorio2;

/*
 * RETO EXTRA - FORMA 1 DE ARREGLO:
 * Implementar obligatoriamente el metodo abstracto heredado 'emitirSonido()'.
 */
public class PezSolucion1 extends AnimalZoologico {

    public PezSolucion1(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() {
        return "Glub glub!";
    }
}

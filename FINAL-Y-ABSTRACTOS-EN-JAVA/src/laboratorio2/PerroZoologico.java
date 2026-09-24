package laboratorio2;

public class PerroZoologico extends AnimalZoologico {

    public PerroZoologico(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() {
        return "Guau guau!";
    }
}

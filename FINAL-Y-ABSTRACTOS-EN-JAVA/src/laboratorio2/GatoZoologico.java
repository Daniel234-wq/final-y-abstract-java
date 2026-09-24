package laboratorio2;

public class GatoZoologico extends AnimalZoologico {

    public GatoZoologico(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() {
        return "Miau miau!";
    }
}

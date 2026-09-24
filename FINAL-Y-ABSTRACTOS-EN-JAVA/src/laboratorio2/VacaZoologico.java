package laboratorio2;

public class VacaZoologico extends AnimalZoologico {

    public VacaZoologico(String nombre) {
        super(nombre);
    }

    @Override
    public String emitirSonido() {
        return "Muuu!";
    }
}

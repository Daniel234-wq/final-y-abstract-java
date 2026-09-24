package sesion02_propiedad;

import java.util.ArrayList;
import java.util.List;

public class TrampaReferencia {
    // Si la propiedad final apunta a un objeto, lo sellado es la referencia, no el contenido.
    private final List<String> notas = new ArrayList<>();

    public void demostrar() {
        // PERMITIDO: Se modifica el contenido interno de la coleccion
        notas.add("Excelente");
        notas.add("Sobresaliente");

        /*
         * ERROR DE COMPILACION:
         * notas = new ArrayList<>();
         * // cannot assign a value to final variable notas
         */
    }

    public List<String> getNotas() {
        return notas;
    }
}


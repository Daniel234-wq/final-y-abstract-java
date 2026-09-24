package sesion07_sobrecarga.reto;

public abstract class Mensaje {
    protected final String contenido;

    public Mensaje(String contenido) {
        this.contenido = contenido;
    }

    // Version 1: sin parametros
    public abstract void enviar();

    // Version 2: con destinatario
    public abstract void enviar(String destinatario);

    // Version 3: con destinatario y prioridad
    public abstract void enviar(String destinatario, String prioridad);

    public String getContenido() {
        return contenido;
    }
}

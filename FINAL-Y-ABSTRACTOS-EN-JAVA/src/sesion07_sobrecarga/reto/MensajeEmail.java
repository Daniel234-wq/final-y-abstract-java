package sesion07_sobrecarga.reto;

public class MensajeEmail extends Mensaje {

    public MensajeEmail(String contenido) {
        super(contenido);
    }

    // Version 1: delega en la version 3 pasando destinatario por defecto y prioridad NORMAL
    @Override
    public void enviar() {
        enviar("contacto@empresa.com", "NORMAL");
    }

    // Version 2: delega en la version 3 pasando la prioridad NORMAL
    @Override
    public void enviar(String destinatario) {
        enviar(destinatario, "NORMAL");
    }

    // Version 3: implementacion real donde se centraliza la logica del envio
    @Override
    public void enviar(String destinatario, String prioridad) {
        System.out.println("Enviando Email [Prioridad: " + prioridad + "] para <" + destinatario + ">: " + contenido);
    }
}

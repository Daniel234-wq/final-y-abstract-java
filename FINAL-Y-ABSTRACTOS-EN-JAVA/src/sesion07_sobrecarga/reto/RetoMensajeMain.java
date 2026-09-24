package sesion07_sobrecarga.reto;

public class RetoMensajeMain {
    public static void main(String[] args) {
        System.out.println("=== RETO SESION 07: MENSAJE Y MENSAJEEMAIL CON DELEGACION ===");

        Mensaje email = new MensajeEmail("Notificacion: Se ha completado la actualizacion del sistema.");

        System.out.println("\n1. Enviar sin parametros (delega con valores por defecto):");
        email.enviar();

        System.out.println("\n2. Enviar con destinatario (delega asignando prioridad NORMAL):");
        email.enviar("gerencia@empresa.com");

        System.out.println("\n3. Enviar con destinatario y prioridad (ejecucion directa):");
        email.enviar("soporte@empresa.com", "ALTA");
    }
}

package sesion04_clase;

// final class cierra la puerta a la herencia por completo.
// Nadie puede extender esta clase.
public final class ConfiguracionSistema {
    public static final String VERSION = "2026.1";
    private final String urlServidor;
    private final int timeoutSegundos;

    public ConfiguracionSistema(String urlServidor, int timeoutSegundos) {
        this.urlServidor = urlServidor;
        this.timeoutSegundos = timeoutSegundos;
    }

    public ConfiguracionSistema() {
        this("https://api.empresa.com", 30);
    }

    // Los metodos de adentro no necesitan marcarse final, ya que al ser la clase final,
    // es imposible heredarlos para sobrescribirlos.
    public String obtenerVersion() {
        return VERSION;
    }

    public String getUrlServidor() {
        return urlServidor;
    }

    public int getTimeoutSegundos() {
        return timeoutSegundos;
    }

    /*
     * Demostracion de intento de herencia ilegal:
     *
     * class Otra extends ConfiguracionSistema { }
     *
     * Error de compilacion:
     * "cannot inherit from final class sesion04_clase.ConfiguracionSistema"
     */
}

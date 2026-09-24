package laboratorio2;

public abstract class AnimalZoologico {
    // 1. Propiedad final nombre asignada una unica vez
    protected final String nombre;

    public AnimalZoologico(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del animal no puede estar vacio.");
        }
        this.nombre = nombre;
    }

    // 2. Metodo abstracto que obliga a cada especie hija a definir su propio sonido
    public abstract String emitirSonido();

    // 3. Metodo concreto que imprime el nombre e invoca al metodo abstracto emitirSonido()
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " (" + getClass().getSimpleName() + ") y hago: " + emitirSonido());
    }

    public String getNombre() {
        return nombre;
    }
}

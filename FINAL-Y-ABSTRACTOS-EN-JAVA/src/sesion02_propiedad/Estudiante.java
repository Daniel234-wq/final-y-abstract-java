package sesion02_propiedad;

public class Estudiante {
    // La propiedad codigo es final: se le puede dar valor una vez y nunca mas.
    private final String codigo;
    // La propiedad nombre no es final, por lo que puede modificarse libremente.
    private String nombre;

    // El constructor asigna el valor al atributo final codigo de forma legal.
    public Estudiante(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Estudiante(String codigo) {
        this.codigo = codigo;
        this.nombre = "Sin nombre";
    }

    // Metodo permitido porque 'nombre' no es final.
    public void cambiarNombre(String n) {
        this.nombre = n;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    /*
     * Demostracion de lo que pasa si se intenta reasignar una variable final:
     *
     * public void hackear() {
     *     this.codigo = "OTRO";
     *     // Error del compilador: cannot assign a value to final variable codigo
     * }
     */
}


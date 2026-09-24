package laboratorio3;

public abstract class Empleado {
    // 1. Constante estatica final compartida por todos los empleados
    public static final double SALARIO_MINIMO = 1423500.0;

    // 1. Propiedad final: la cedula se asigna al crearse y nunca puede cambiar
    protected final String cedula;
    // El nombre puede actualizarse si fuese necesario
    protected String nombre;

    public Empleado(String cedula, String nombre) {
        if (cedula == null || cedula.trim().isEmpty()) {
            throw new IllegalArgumentException("La cedula es obligatoria y no puede ser nula.");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio y no puede ser nulo.");
        }
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // 2. Metodo abstracto base para calcular el salario normal
    public abstract double calcularSalario();

    // 3. Sobrecarga del metodo abstracto para calcular el salario con horas extra
    public abstract double calcularSalario(int horasExtra);

    // 4. Metodo final que ninguna subclase puede alterar o sobrescribir
    public final void mostrarCedula() {
        System.out.println("Cedula (inmutable): " + cedula);
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

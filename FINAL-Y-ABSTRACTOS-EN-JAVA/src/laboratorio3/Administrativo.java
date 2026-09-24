package laboratorio3;

/*
 * ============================================================================
 * RETO EXTRA:
 * Conversion de 'Administrativo' a 'final class'.
 *
 * CONSECUENCIA PARA EL FUTURO DEL SISTEMA:
 * Al declarar Administrativo como 'final class', se sella completamente esta
 * rama de la jerarquia. Ninguna otra clase podra extenderla ni heredar de ella.
 *
 * Consecuencias practicas:
 * 1. SEGURIDAD Y ESTABILIDAD: Garantiza que la logica de salario fijo de un
 *    administrativo no pueda ser alterada, debilitada o sobrescrita por subclases
 *    no autorizadas.
 * 2. CIERRE DE EXTENSIBILIDAD: Si en el futuro la empresa desea agregar cargos
 *    especializados derivados de Administrativo (por ejemplo: 'SecretarioEjecutivo',
 *    'JefeRecursosHumanos' o 'AuxiliarContable'), NO podran heredar directamente
 *    de Administrativo.
 * 3. ALTERNATIVA DE DISENO: Cualquier funcionalidad futura debera implementarse
 *    mediante composicion (agregando Administrativo como atributo) o creando
 *    una nueva clase que herede directamente de la clase abstracta Empleado.
 * ============================================================================
 */
public final class Administrativo extends Empleado {
    private final double salarioFijo;
    private final double valorHoraExtra;

    public Administrativo(String cedula, String nombre, double salarioFijo, double valorHoraExtra) {
        super(cedula, nombre);
        this.salarioFijo = salarioFijo;
        this.valorHoraExtra = valorHoraExtra;
    }

    public Administrativo(String cedula, String nombre, double salarioFijo) {
        this(cedula, nombre, salarioFijo, 15000.0);
    }

    // Version 1: Salario mensual fijo pactado
    @Override
    public double calcularSalario() {
        return salarioFijo;
    }

    // Version 2: Salario fijo mas compensacion por horas extra
    @Override
    public double calcularSalario(int horasExtra) {
        int horasValidas = Math.max(0, horasExtra);
        return salarioFijo + (horasValidas * valorHoraExtra);
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }
}

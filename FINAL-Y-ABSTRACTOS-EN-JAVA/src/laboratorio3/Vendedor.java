package laboratorio3;

public class Vendedor extends Empleado {
    private final double salarioBase;
    private final double ventasTotales;
    private final double porcentajeComision; // Ejemplo: 0.10 para 10%
    private final double valorHoraExtra;

    public Vendedor(String cedula, String nombre, double salarioBase, double ventasTotales, double porcentajeComision, double valorHoraExtra) {
        super(cedula, nombre);
        this.salarioBase = salarioBase;
        this.ventasTotales = ventasTotales;
        this.porcentajeComision = porcentajeComision;
        this.valorHoraExtra = valorHoraExtra;
    }

    public Vendedor(String cedula, String nombre, double salarioBase, double ventasTotales, double porcentajeComision) {
        this(cedula, nombre, salarioBase, ventasTotales, porcentajeComision, 12000.0);
    }

    // Version 1: Salario base + comision sobre ventas realizadas
    @Override
    public double calcularSalario() {
        double comision = ventasTotales * porcentajeComision;
        return salarioBase + comision;
    }

    // Version 2: Salario normal + pago por horas extra trabajadas
    @Override
    public double calcularSalario(int horasExtra) {
        int horasValidas = Math.max(0, horasExtra);
        return calcularSalario() + (horasValidas * valorHoraExtra);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getVentasTotales() {
        return ventasTotales;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }
}

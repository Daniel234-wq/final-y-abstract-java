package laboratorio3;

public class Laboratorio3Main {
    public static void main(String[] args) {
        System.out.println("=== LABORATORIO 3: SISTEMA DE EMPLEADOS ===");
        System.out.println("Salario Minimo Legal de Referencia: $" + Empleado.SALARIO_MINIMO);

        // 6. Arreglo polimorfico Empleado[] con instancias de Vendedor y Administrativo
        Empleado[] nomina = {
            new Vendedor("1020304050", "Laura Sanchez", 1500000.0, 8000000.0, 0.05, 12500.0),
            new Administrativo("9876543210", "Andres Martinez", 2400000.0, 18000.0)
        };

        System.out.println("\n--- Liquidacion de Salarios Regulares y con Horas Extra ---");
        int horasExtraPrueba = 10;

        for (Empleado emp : nomina) {
            System.out.println("\nTipo: " + emp.getClass().getSimpleName());
            System.out.println("Nombre: " + emp.getNombre());
            emp.mostrarCedula(); // Metodo final protegido contra sobrescritura

            double salarioOrdinario = emp.calcularSalario();
            double salarioConExtras = emp.calcularSalario(horasExtraPrueba);

            System.out.println("Salario Ordinario: $" + salarioOrdinario);
            System.out.println("Salario con " + horasExtraPrueba + " Horas Extra: $" + salarioConExtras);
        }

        System.out.println("\n--- Resumen del Reto Extra ---");
        System.out.println("La clase Administrativo fue declarada 'public final class Administrativo extends Empleado'.");
        System.out.println("Consecuencia: Se sella la herencia. Ninguna subclase podra extender de Administrativo.");
    }
}

package sesion03_metodo;

public class Sesion03Main {
    public static void main(String[] args) {
        System.out.println("=== SESION 03: FINAL EN METODOS Y PARAMETROS ===");

        CuentaBancaria cuentaGenerica = new CuentaBancaria(1000.0);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(2500.0, 0.05);

        System.out.println("\n--- Validacion de clave con metodo final ---");
        System.out.println("Clave '123' valida?: " + cuentaGenerica.validarClave("123"));
        System.out.println("Clave 'claveSegura2026' valida?: " + cuentaGenerica.validarClave("claveSegura2026"));
        System.out.println("Clave en CuentaAhorro heredada intacta: " + cuentaAhorro.validarClave("claveSegura2026"));

        System.out.println("\n--- Mostrar saldo (metodo sobrescrito) ---");
        cuentaGenerica.mostrarSaldo();
        cuentaAhorro.mostrarSaldo();

        System.out.println("\n--- Parametros final en Calculadora ---");
        Calculadora calc = new Calculadora();
        System.out.println("Duplicar 25: " + calc.duplicar(25));
        System.out.println("Calcular impuesto (1000, 19%): " + calc.calcularImpuesto(1000, 19));

        System.out.println("\n--- Punto de Control ---");
        System.out.println("Pregunta: Un metodo private necesita marcarse como final para que no lo sobrescriban?");
        System.out.println("Respuesta: No. Los metodos private son invisibles para las subclases; no se heredan y por ende no se pueden sobrescribir.");
    }
}

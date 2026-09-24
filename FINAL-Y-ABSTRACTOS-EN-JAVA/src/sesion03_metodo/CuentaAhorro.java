package sesion03_metodo;

public class CuentaAhorro extends CuentaBancaria {
    private final double tasaInteres;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    // Sobrescritura permitida: mostrarSaldo() no es final en CuentaBancaria.
    @Override
    public void mostrarSaldo() {
        double interesEstimado = getSaldo() * tasaInteres;
        System.out.println("Ahorro + interes: $" + getSaldo() + " (Interes estimado: $" + interesEstimado + ")");
    }

    /*
     * Demostracion de intento ilegal:
     * Si intentamos sobrescribir validarClave(String c):
     *
     * @Override
     * public boolean validarClave(String c) {
     *     return true; // Intento de aceptar cualquier clave
     * }
     *
     * El compilador detiene la compilacion con el error:
     * "validarClave(String) in CuentaAhorro cannot override final method in CuentaBancaria"
     */
}

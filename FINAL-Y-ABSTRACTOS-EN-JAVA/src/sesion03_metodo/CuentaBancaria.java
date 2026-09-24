package sesion03_metodo;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {
        this.saldo = 0.0;
    }

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Metodo sellado: ninguna subclase puede alterarlo, debilitar la seguridad o saltarselo.
    public final boolean validarClave(String c) {
        return c != null && c.length() >= 8;
    }

    // Metodo abierto: no es final, por lo que una subclase si puede personalizar su presentacion.
    public void mostrarSaldo() {
        System.out.println("Saldo disponible: $" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}

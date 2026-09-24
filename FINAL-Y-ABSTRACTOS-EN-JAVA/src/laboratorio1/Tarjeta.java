package laboratorio1;

public class Tarjeta {
    // Constante compartida por todas las tarjetas emitidas por la entidad.
    public static final String BANCO = "Banco Central";

    // 1 y 2. Propiedades marcadas como final porque identifican la cuenta y no deben cambiar nunca.
    private final String numero;
    private final String titular;

    // El saldo varia constantemente en el tiempo (depositos, retiros, transferencias), por lo que NO debe ser final.
    private double saldo;

    // 3. Asignacion de las propiedades final dentro del constructor.
    public Tarjeta(String numero, String titular, double saldoInicial) {
        if (numero == null || numero.trim().isEmpty()) {
            throw new IllegalArgumentException("El numero de tarjeta no puede ser vacio.");
        }
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular no puede ser vacio.");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // 5. Metodo depositar que modifica el saldo legalmente.
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a depositar debe ser mayor que 0.");
            return;
        }
        this.saldo += monto;
        System.out.println("Deposito exitoso de $" + monto + ". Nuevo saldo: $" + this.saldo);
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarInformacion() {
        System.out.println("Banco: " + BANCO);
        System.out.println("Numero de Tarjeta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Actual: $" + saldo);
    }

    /*
     * RETO EXTRA:
     * Si intentamos crear un metodo para cambiar el numero de tarjeta:
     *
     * public void cambiarNumero(String nuevoNumero) {
     *     this.numero = nuevoNumero;
     * }
     *
     * Resultado al compilar:
     * javac arroja: "error: cannot assign a value to final variable numero"
     * Razon: Al estar declarado como 'final', el atributo queda sellado en memoria
     * tras la ejecucion del constructor.
     */
}

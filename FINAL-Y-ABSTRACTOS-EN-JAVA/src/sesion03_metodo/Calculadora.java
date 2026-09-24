package sesion03_metodo;

public class Calculadora {
    // Uso de final en parametros para evitar reasignaciones accidentales dentro del cuerpo del metodo.
    public int duplicar(final int valor) {
        /*
         * valor = 10;
         * Error de compilacion: cannot assign a value to final variable valor
         */
        return valor * 2; // Leerlo siempre es valido
    }

    public double calcularImpuesto(final double base, final double porcentaje) {
        return base * (porcentaje / 100.0);
    }
}

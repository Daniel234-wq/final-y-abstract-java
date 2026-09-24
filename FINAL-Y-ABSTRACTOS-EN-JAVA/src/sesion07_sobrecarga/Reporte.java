package sesion07_sobrecarga;

public abstract class Reporte {
    // 1. Version sin parametros: el reporte mas simple
    public abstract void generar();

    // 2. Mismo nombre, un parametro
    public abstract void generar(String titulo);

    // 3. Tercera version con dos parametros. La hija debera implementar las tres.
    public abstract void generar(String t, int p);
}

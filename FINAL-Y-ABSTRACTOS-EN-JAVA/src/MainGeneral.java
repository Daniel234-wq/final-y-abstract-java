import sesion02_propiedad.Sesion02Main;
import laboratorio1.Laboratorio1Main;
import sesion03_metodo.Sesion03Main;
import sesion04_clase.Sesion04Main;
import sesion05_abstractas.Sesion05Main;
import sesion06_metodos_abstractos.Sesion06Main;
import laboratorio2.Laboratorio2Main;
import sesion07_sobrecarga.Sesion07Main;
import sesion07_sobrecarga.reto.RetoMensajeMain;
import laboratorio3.Laboratorio3Main;

public class MainGeneral {
    public static void main(String[] args) {
        System.out.println("===============================================================");
        System.out.println("   EJECUCION COMPLETA: FINAL Y ABSTRACTOS EN JAVA");
        System.out.println("===============================================================\n");

        System.out.println(">>> 1. SESION 02 Y EJEMPLOS DE PROPIEDAD FINAL <<<");
        Sesion02Main.main(args);
        System.out.println();

        System.out.println(">>> 2. LABORATORIO 01: TARJETA DE IDENTIFICACION <<<");
        Laboratorio1Main.main(args);
        System.out.println();

        System.out.println(">>> 3. SESION 03: FINAL EN METODOS Y PARAMETROS <<<");
        Sesion03Main.main(args);
        System.out.println();

        System.out.println(">>> 4. SESION 04: FINAL EN CLASES Y SEALED CLASSES <<<");
        Sesion04Main.main(args);
        System.out.println();

        System.out.println(">>> 5. SESION 05: CLASES ABSTRACTAS Y CONSTRUCTORES <<<");
        Sesion05Main.main(args);
        System.out.println();

        System.out.println(">>> 6. SESION 06: METODOS ABSTRACTOS Y POLIMORFISMO <<<");
        Sesion06Main.main(args);
        System.out.println();

        System.out.println(">>> 7. LABORATORIO 02: EL ZOOLOGICO (CON RETO PEZ) <<<");
        Laboratorio2Main.main(args);
        System.out.println();

        System.out.println(">>> 8. SESION 07: SOBRECARGA DE METODOS ABSTRACTOS <<<");
        Sesion07Main.main(args);
        System.out.println();

        System.out.println(">>> 9. RETO SESION 07: MENSAJE Y MENSAJEEMAIL CON DELEGACION <<<");
        RetoMensajeMain.main(args);
        System.out.println();

        System.out.println(">>> 10. LABORATORIO 03: SISTEMA DE EMPLEADOS (CON RETO FINAL) <<<");
        Laboratorio3Main.main(args);
        System.out.println();

        System.out.println("===============================================================");
        System.out.println("   TODOS LOS MODULOS Y LABORATORIOS SE EJECUTARON CON EXITO");
        System.out.println("===============================================================");
    }
}

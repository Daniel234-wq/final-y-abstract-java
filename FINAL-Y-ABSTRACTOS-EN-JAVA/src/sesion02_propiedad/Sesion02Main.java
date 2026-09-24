package sesion02_propiedad;

import java.util.Arrays;

public class Sesion02Main {
    public static void main(String[] args) {
        System.out.println("=== SESION 02: FINAL EN PROPIEDADES Y CONSTANTES ===");

        // 1. Demostracion de Estudiante
        Estudiante est = new Estudiante("EST-101", "Carlos Gomez");
        System.out.println("Estudiante creado:");
        System.out.println("Codigo (final): " + est.getCodigo());
        System.out.println("Nombre original: " + est.getNombre());
        est.cambiarNombre("Carlos Alberto Gomez");
        System.out.println("Nombre modificado: " + est.getNombre());

        // 2. Demostracion de Circulo y static final
        Circulo c1 = new Circulo(5.0);
        System.out.println("\nCirculo de radio: " + c1.getRadio());
        System.out.println("Constante PI: " + Circulo.PI);
        System.out.println("Area calculada: " + c1.area());

        // 3. Demostracion de TrampaReferencia
        TrampaReferencia tr = new TrampaReferencia();
        tr.demostrar();
        System.out.println("\nContenido de la lista final (mutacion permitida): " + tr.getNotas());

        // 4. Punto de control resuelto:
        // Pregunta: Si escribes final int[] numeros = {1, 2, 3}; - ¿puedes hacer numeros[0] = 99;?
        final int[] numeros = {1, 2, 3};
        System.out.println("\nPunto de control - Arreglo inicial: " + Arrays.toString(numeros));
        numeros[0] = 99; // PERMITIDO: la referencia al arreglo no cambia, solo su elemento
        System.out.println("Punto de control - Arreglo tras numeros[0] = 99: " + Arrays.toString(numeros));
        System.out.println("Respuesta punto de control: SI es permitido modificar el contenido del arreglo.");
    }
}

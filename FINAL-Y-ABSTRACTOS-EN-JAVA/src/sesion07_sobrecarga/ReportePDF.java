package sesion07_sobrecarga;

public class ReportePDF extends Reporte {

    // Las versiones cortas delegan en la version mas completa, evitando duplicar codigo
    @Override
    public void generar() {
        generar("Sin titulo", 1);
    }

    @Override
    public void generar(String titulo) {
        generar(titulo, 1);
    }

    @Override
    public void generar(String t, int pags) {
        System.out.println("PDF: " + t + " (" + pags + " pag.)");
    }
}

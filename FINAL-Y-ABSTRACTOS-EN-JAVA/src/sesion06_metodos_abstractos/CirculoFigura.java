package sesion06_metodos_abstractos;

public class CirculoFigura extends Figura {
    private final double radio;

    public CirculoFigura(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double getRadio() {
        return radio;
    }
}

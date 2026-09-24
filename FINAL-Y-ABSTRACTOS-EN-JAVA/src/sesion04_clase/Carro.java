package sesion04_clase;

// Carro es final: la rama de herencia termina aqui definitivamente.
public final class Carro extends Vehiculo {
    private final int numeroPuertas;

    public Carro(String placa, int numeroPuertas) {
        super(placa);
        this.numeroPuertas = numeroPuertas;
    }

    public Carro(String placa) {
        this(placa, 4);
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo carro (" + numeroPuertas + " puertas) con placa: " + placa);
    }
}

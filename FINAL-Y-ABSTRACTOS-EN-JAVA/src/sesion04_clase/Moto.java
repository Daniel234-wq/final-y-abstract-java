package sesion04_clase;

// non-sealed reabre la jerarquia: de Moto cualquier clase puede heredar.
public non-sealed class Moto extends Vehiculo {
    private final int cilindraje;

    public Moto(String placa, int cilindraje) {
        super(placa);
        this.cilindraje = cilindraje;
    }

    public Moto(String placa) {
        this(placa, 250);
    }

    public int getCilindraje() {
        return cilindraje;
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo moto de " + cilindraje + "cc con placa: " + placa);
    }
}

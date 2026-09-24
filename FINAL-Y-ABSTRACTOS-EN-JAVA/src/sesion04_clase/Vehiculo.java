package sesion04_clase;

// sealed ... permits restringe la herencia estrictamente a las clases listadas.
public sealed class Vehiculo permits Carro, Moto {
    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void conducir() {
        System.out.println("Conduciendo vehiculo con placa: " + placa);
    }
}

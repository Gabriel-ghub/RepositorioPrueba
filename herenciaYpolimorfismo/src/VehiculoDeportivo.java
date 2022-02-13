public class VehiculoDeportivo extends Vehiculo {
    int cilindrada;
    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "Cilindrada: " + this.cilindrada;
    }
}

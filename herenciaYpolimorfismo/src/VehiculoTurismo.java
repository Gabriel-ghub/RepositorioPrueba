public class VehiculoTurismo extends Vehiculo {
    int nPuertas;
    public VehiculoTurismo(int nPuertas,String matricula, String marca,String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    @Override
    public String toString() {
        return super.toString() +"Puertas: "+this.nPuertas;
    }
}

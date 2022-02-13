public class VehiculoUtilitario extends Vehiculo{
    int carga;

    public VehiculoUtilitario(int carga,String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + "carga: "+this.carga;
    }
}

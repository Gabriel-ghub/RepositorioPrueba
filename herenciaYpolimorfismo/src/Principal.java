public class Principal {
    public static void main(String[] args) {
        Vehiculo [] misVehiculos = new Vehiculo[4];


        misVehiculos [0] = new Vehiculo("7847", "Ford", "Mondeo");
        misVehiculos [1] = new VehiculoTurismo(4,"4512", "Opel", "Astra");
        misVehiculos [2] = new VehiculoDeportivo(147,"dddcc", "Fiat", "Punto");
        misVehiculos [3] = new VehiculoUtilitario(147,"74484", "Chevrolet", "Cruze");


        System.out.println(misVehiculos[0].toString());
        System.out.println(misVehiculos[1].toString());
        System.out.println(misVehiculos[2].toString());
        System.out.println(misVehiculos[3].toString());

        for (Vehiculo v:
             misVehiculos) {
            System.out.println(v.toString());
        }

    }
}

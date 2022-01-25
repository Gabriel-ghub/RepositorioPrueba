public class Pruebas {
    public static void main(String[] args) {
        Menu init = new Menu();
        Hospital Garraham = new Hospital("Garraham", 23232);
        Doctor d1 = new Doctor("23434568O", "Gerardo", "Sosa",23,"DERMATOLOGY", 233.3);
        Garraham.addDoctor(d1);
        for (Doctor d : Garraham.getDoctors()) {
            System.out.println(d.getDni());
        }
    }
}

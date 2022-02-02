public class Main {
    public static void main(String[] args) {

//        Creacion de paciente

        Patient p1 = new Patient("71769762X", "12312312312312","Gabriel", "Romero", 26, 123123123, "DERMATOLOGY");
//        System.out.println(p1.toString());

//        Creacion de Doctor

       Doctor d1 = new Doctor("65257267B", "Gerardo", "Sosa",23,"DERMATOLOGY", 233.3);

//        Creacion de Hospital

//        Hospital Garraham = new Hospital("Garraham", 23232);

//        Metodos hospital


//        System.out.println(Garraham.toString());

        Menu init = new Menu();
        Hospital Garraham = new Hospital("Garraham", 23232);
        Garraham.addPatient(p1);
        Garraham.addDoctor(d1);
        init.inicioMenu(Garraham);




    }


}

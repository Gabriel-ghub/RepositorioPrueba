public class Main {
    public static void main(String[] args) {

//        Creacion de paciente

        Patient p1 = new Patient("71769762X", "12312312312312","Gabriel", "Romero", 26, 123123123, "DERMATOLOGY");
        Patient p2 = new Patient("57658000J", "12312312312312","Ernesto", "Romero", 26, 123123123, "CARDIOLOGY");
        Patient p3 = new Patient("29088880K", "12312312312312","Miguel", "Romero", 26, 123123123, "PULMONOLOGY");
        Patient p4 = new Patient("17193698W", "12312312312312","Nicolas", "Romero", 26, 123123123, "PEDIATRICS");
        Patient p5 = new Patient("97527515V", "12312312312312","Federico", "Romero", 26, 123123123, "TRAUMATOLOGY");
        Patient p6 = new Patient("98597808M", "12312312312312","Horacio", "Romero", 26, 123123123, "OTRARANDOM");
//        System.out.println(p1.toString());

//        Creacion de Doctor

       Doctor d1 = new Doctor("65257267B", "Gerardo", "Sosa",23,"DERMATOLOGY", 233.3);
        Doctor d2 = new Doctor("43288808W", "Matias", "Meneza",26,"CARDIOLOGY", 233.3);
        Doctor d3 = new Doctor("37430556B", "Nicolas", "Penas",65,"PULMONOLOGY", 233.3);
        Doctor d4 = new Doctor("06056195L", "Maria", "Antonieta",34,"PEDIATRICS", 233.3);
        Doctor d5 = new Doctor("43473126K", "Jesus", "Vivaldi",53,"TRAUMATOLOGY", 233.3);

//        Creacion de Hospital

//        Hospital Garraham = new Hospital("Garraham", 23232);

//        Metodos hospital


//        System.out.println(Garraham.toString());

        Menu init = new Menu();
        Hospital Garraham = new Hospital("Garraham", 23232);
        Garraham.addPatient(p1);
        Garraham.addPatient(p2);
        Garraham.addPatient(p3);
        Garraham.addPatient(p4);
        Garraham.addPatient(p5);
        Garraham.addPatient(p6);
        Garraham.addDoctor(d1);
        Garraham.addDoctor(d2);
        Garraham.addDoctor(d3);
        Garraham.addDoctor(d4);
        Garraham.addDoctor(d5);
        init.inicioMenu(Garraham);
    }
}

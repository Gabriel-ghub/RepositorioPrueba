
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Hospital {
   private String name;
   private double money;
   private ArrayList<String> specialities = new ArrayList<String>();
   private ArrayList<Patient>patientsWaiting;
   private ArrayList<Doctor>doctors;


    public Hospital(String name, double money){
        this.name= name;
        this.money= money;
        patientsWaiting=new ArrayList<Patient>();
        this.doctors=new ArrayList<Doctor>();
        specialities.add("DERMATOLOGY");
        specialities.add("CARDIOLOGY");
        specialities.add("PULMONOLOGY");
        specialities.add("PEDIATRICS");
        specialities.add("TRAUMATOLOGY");

    }


    public void addPatient(Patient patient){
        patientsWaiting.add(patient);
    }
    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
    }

    public Patient registerPatient(Patient e){
        patientsWaiting.add(e);
        return e;
    }

    public Doctor registerDoctor(Doctor e){
        doctors.add(e);
        return e;
    }

    public ArrayList<Patient> getPatientsWaiting() {
        return patientsWaiting;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void modifyPatient(String dni){
        Scanner s = new Scanner(System.in);
        if(patientsWaiting.size() == 0){
            System.out.println("No existe ningun paciente");
        }
        else {
            for (Patient p :
                    patientsWaiting) {
                if (!dni.equals(p.getDni())) {
                    System.out.println("El dni no existe");
                }
                else{
                    System.out.println("Que dato desea modificar?: \n" +
                            "1- DNI: " + p.getDni()+ "\n"+
                            "2- SSN: " + p.getSsn()+ "\n"+
                            "3- Name: " + p.getName()+ "\n"+
                            "4- LastName: " + p.getLastName()+ "\n"+
                            "5- Age: " + p.getAge()+ "\n"+
                            "6- Phone: " + p.getPhone()+ "\n"+
                            "7- Disease: " + p.getDisease()+ "\n"+
                            "8- Exit");
                    int opcion = s.nextInt();
                        switch (opcion) {
                            case 1:
                                Menu m = new Menu();
                                String dniTemp="";
                                boolean flag = true;
                                while (flag){
                                    System.out.println("Por favor, ingrese los datos Paciente: \n DNI:");
                                    dniTemp = s.next();
                                    for (Patient a :
                                            patientsWaiting) {
                                        if(dniTemp.equals(a.getDni())){
                                            System.out.println("El DNI ya existe, ingrese otro:");
                                            dniTemp= s.next();

                                        }
                                    }
                                    flag=false;
                                }
                                while(dniTemp.length() !=9){
                                    System.out.println("Error de longitud, ingrese un DNI correcto:");
                                    dniTemp= s.next();
                                }
                                p.setDni(m.validarDni(dniTemp));
                                System.out.println("El cambio fue realizado con exito. !Muchas gracias!");
                        }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", specialities=" + specialities +
                ", patientsWaiting=" + patientsWaiting +
                ", doctors=" + doctors +
                '}';
    }

}

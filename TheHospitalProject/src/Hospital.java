
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Hospital {
   private String name;
   private double money;
   private ArrayList<String> specialities = new ArrayList<String>();
   private ArrayList<Patient>patientsWaiting;
   private ArrayList<Doctor>doctors;
    private ArrayList<Patient>patientUnattended = new ArrayList<>();



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

    public ArrayList<Patient> getPatientUnattended() {
        return patientUnattended;
    }

    public void setPatientUnattended(ArrayList<Patient> patientUnattended) {
        this.patientUnattended = patientUnattended;
    }

    public ArrayList<Patient> getPatientsWaiting() {
        return patientsWaiting;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void modifyPatient(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the patient's ID:");
        String dniTemp=s.next();
        if(patientsWaiting.size() == 0){
            System.out.println("There is no patient");
        }
        else {
            for (Patient p :
                    patientsWaiting) {
                if (!dniTemp.equals(p.getDni())) {
                    System.out.println("The DNI does not exist");
                }
                else{
                    System.out.println("Only phone can be modified \n" +
                            "1- Phone: " + p.getPhone()+ "\n"+
                            "2- Exit");
                    try {
                    int opcion = s.nextInt();
                        switch (opcion) {
                            case 1:
                                try{
                                System.out.println("Enter the new phone");
                                p.setPhone(s.nextInt());
                                System.out.println("Thank you very much, the operation was successful");
                                break;
                                }catch (InputMismatchException e){
                                    System.out.println("You must enter a number");
                                }
                            case 2:
                                break;
                            default:
                                System.out.println("Invalid option. You will need to start the operation again ");

                        }
                    } catch (InputMismatchException e) {
                        System.out.println("You must enter a number. You will have to start the operation again");
                    }
                }
            }
        }
    }



    public void modifyDoctor(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Doctor's DNI:");
        String dniTemp=s.next();
        if(patientsWaiting.size() == 0){
            System.out.println("There is no doctor");
        }
        else {
            for (Doctor d :
                    doctors) {
                if (!dniTemp.equals(d.getDni())) {
                    System.out.println("The DNI does not exist");
                }
                else{
                    System.out.println("You can only change the salary \n" +
                            "1- Salary: " + d.getSalary()+ "\n"+
                            "2- Exit");
                    try {
                        int opcion = s.nextInt();
                        switch (opcion) {
                            case 1:
                                try{
                                    System.out.println("Enter the new salary");
                                    d.setSalary(s.nextInt());
                                    System.out.println("Thank you very much, the operation was successful");
                                    break;
                                }catch (InputMismatchException e){
                                    System.out.println(
                                            "You must enter a number");
                                }
                            case 2:
                                break;
                            default:
                                System.out.println("Invalid option. You will need to start the operation again ");

                        }
                    } catch (InputMismatchException e) {
                        System.out.println("You must enter a number. You will need to start the operation again");
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


    public ArrayList<String> getSpecialities() {
        return specialities;
    }
}

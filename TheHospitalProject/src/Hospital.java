
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

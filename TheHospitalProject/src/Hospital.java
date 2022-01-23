
import java.util.ArrayList;
import java.util.Arrays;

public class Hospital {
    String name;
    double money;
    ArrayList<String> specialities = new ArrayList<String>();
    ArrayList<Patient>patientsWaiting;
    ArrayList<Doctor>doctors;


    public Hospital(String name, double money){
        this.name= name;
        this.money= money;
        this.patientsWaiting=new ArrayList<Patient>();
        this.doctors=new ArrayList<Doctor>();
        specialities.add("DERMATOLOGY");
        specialities.add("CARDIOLOGY");
        specialities.add("PULMONOLOGY");
        specialities.add("PEDIATRICS");
        specialities.add("TRAUMATOLOGY");

    }

    public void addPatient(Patient patient){
        this.patientsWaiting.add(patient);
    }
    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
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

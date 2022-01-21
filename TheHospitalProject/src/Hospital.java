
import java.util.ArrayList;
import java.util.Arrays;

public class Hospital {
    String name;
    double money;
    ArrayList<String> specialities= (ArrayList<String>) Arrays.asList("DERMATOLOGY","CARDIOLOGY","PULMONOLOGY","PEDIATRICS","TRAUMATOLOGY");
    ArrayList<Patient>patientsWaiting;
    ArrayList<Doctor>doctors;


    public Hospital(String name, double money){
        this.name= name;
        this.money= money;
        this.patientsWaiting=new ArrayList<Patient>();
        this.doctors=new ArrayList<Doctor>();
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

import javax.print.Doc;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu {

    public void inicioMenu(Hospital hospital) {

        Scanner s = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        while (!salir) {

            System.out.println("Welcome to the Hospital. Please, enter an option.");
            System.out.println(
                    "MENU:" + "\n" +
                            "1 - Register patient\n" +
                            "2 - Register doctor\n" +
                            "3 - Modify patient\n" +
                            "4 - Modify doctor\n" +
                            "5 - Patients menu\n" +
                            "6 - Show all doctors\n" +
                            "7 - Delete doctor\n" +
                            "8 - Attend a patient\n" +
                            "9 - Add speciality\n" +
                            "10 - Show all specialities\n"+
                            "11 - Exit"
            );

            try {
                opcion = s.nextInt();
                switch (opcion) {
                    case 1:
                        hospital.registerPatient(tomarDatosPaciente(hospital));
                        break;
                    case 2:
                        hospital.registerDoctor(tomarDatosDoctor(hospital));
                        break;
                    case 3:
                        hospital.modifyPatient();
                        break;
                    case 4:
                        hospital.modifyDoctor();
                        break;
                    case 5:
                        menuPacientes(hospital);
                        break;
                    case 6:
                        for (Doctor d:
                             hospital.getDoctors()) {
                            System.out.println("Name:"+d.name + " /"+"LastName: "+d.getLastName() +" / DNI: "+ d.getDni() + " /"+"Speciality: "+d.getSpeciality());
                        }
                        System.out.println("");
                        break;

                    case 7:
                        borrarDoctor(hospital);
                        break;

                    case 8:
                        atenddPatient(hospital);
                        break;
                    case 9:
                        addSpeciality(hospital);
                        break;
                    case 10:
                        System.out.println("These are our specialities");
                        for (String spe:
                             hospital.getSpecialities()) {
                            System.out.println(spe);
                        }
                        System.out.println();
                        break;
                    case 11:
                        salir = true;
                        break;

                    default:
                        System.out.println("Invalid option. Plase choose an option");
                }
            } catch (InputMismatchException e) {
                System.out.println("Yo must enter a number");
                s.nextLine();
            }
        }
        System.out.println("Bye!");
    }


    //METODO TOMAR DATOS PACIENTE

    public Patient tomarDatosPaciente(Hospital hospital) {
        boolean flag = true;
        while (flag) {
            Scanner s = new Scanner(System.in);
            String dni = null;
            String ssn;
            String name;
            String lastName;
            int age;
            int phone;
            boolean esValido;
            String disease;
            String dniTemp = "";
            System.out.println("Insert DNI:");
            dniTemp = s.next();
            esValido = validarDniCorrecto(dniTemp, hospital);
            if(!esValido){
                break;
            }else{
                dni = dniTemp;
            }

            System.out.println("SSN number:");
            ssn = s.next();

            System.out.println("Name:");
            name = s.next();

            System.out.println("LastName:");
            lastName = s.next();

            System.out.println("Age:");
            age = s.nextInt();
            if(age<0 || age>120){
                System.out.println("The age is wrong, it must be between 0 and 120. The app will close");
                break;
            }

            System.out.println("Phone:");
            phone = s.nextInt();

            System.out.println("Disease:");
            disease = s.next();

            return new Patient(dni, ssn, name, lastName, age, phone, disease);
        }
        return null;
    }



    public Doctor tomarDatosDoctor(Hospital hospital) {
        boolean flag = true;
        while (flag) {
            Scanner s = new Scanner(System.in);
            String dni;
            String name;
            String lastName;
            int age;
            String speciality;
            double salary;
            boolean esValido;
            String disease;
            String dniTemp = "";
            String specialityTemp="";
            System.out.println("Insert DNI:");
            dniTemp = s.nextLine();
            esValido = validarDniCorrectoDoctor(dniTemp, hospital);
            if (!esValido) {
                break;
            } else {
                dni = dniTemp;
            }
            System.out.println("Name:");
            name = s.next();

            System.out.println("LastName:");
            lastName = s.next();

            System.out.println("Age:");
            age = s.nextInt();
            if(age<0 || age>120){
                System.out.println("The age is wrong, it must be between 0 and 120. The app will close");
                break;
            }

            System.out.println("Speciality:");
            specialityTemp = s.nextLine();
            boolean especialidad = validarEspecialidad(specialityTemp,hospital);
            if(!especialidad){
               break;
            }else{
                speciality=specialityTemp;
            }

            System.out.println("Salary:");
            salary = s.nextDouble();

            return new Doctor(dni, name, lastName, age, speciality, salary);
        }
        return null;
    }



    //METODO VALIDADOR DE DNI

    public boolean validarDniCorrecto(String dni, Hospital hospital){
        Scanner s = new Scanner(System.in);
        String dniTemp = dni;
        Pattern patron = Pattern.compile("[0-9]{7,8}[A-Za-z]");
        Matcher mat = patron.matcher(dniTemp);
        String letra[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        if (!mat.matches()){
            System.out.println("The DNI is wrong, remember it has to have 8 numbers and one letter (The letter will be validated)");
            return false;
        }else if(mat.matches()){
            String letraDni = dniTemp.substring(8,9).toUpperCase();
            int numDni = Integer.parseInt(dniTemp.substring(0,8));
            int posicionArray = numDni%23;
            if(!letraDni.equals(letra[posicionArray])){
                System.out.println("The DNI is wrong, remember it has to have 8 numbers and one letter (The letter will be validated)");
                return false;
            }else{
                for (Patient p :
                        hospital.getPatientsWaiting()) {
                    if (dniTemp.equals(p.getDni())) {
                        System.out.println("DNI alredy exists.");
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public boolean validarDniCorrectoDoctor(String dni, Hospital hospital){
        Scanner s = new Scanner(System.in);
        String dniTemp = dni;
        Pattern patron = Pattern.compile("[0-9]{7,8}[A-Za-z]");
        Matcher mat = patron.matcher(dniTemp);
        String letra[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        if (!mat.matches()){
            System.out.println("The DNI is wrong, remember it has to have 8 numbers and one letter (The letter will be validated)");
            return false;
        }else if(mat.matches()){
            String letraDni = dniTemp.substring(8,9).toUpperCase();
            int numDni = Integer.parseInt(dniTemp.substring(0,8));
            int posicionArray = numDni%23;
            if(!letraDni.equals(letra[posicionArray])){
                System.out.println("The DNI is wrong, remember it has to have 8 numbers and one letter (The letter will be validated)");
                return false;
            }else{
                for (Doctor d :
                        hospital.getDoctors()) {
                    if (dniTemp.equals(d.getDni())) {
                        System.out.println("DNI alredy exists.");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean validarEspecialidad(String speciality,Hospital hospital){
        for (String h :
                hospital.getSpecialities()) {
            if(!speciality.equals(h)){
                System.out.println("The hospital doesn´t have this speciality, you can´t be registered. Sorry.");
                return false;
            }else{
                return true;
            }
        }
        return false;
    }

    public void borrarDoctor(Hospital hospital){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the DNI of the doctor you want to delete:");
        String dni = s.nextLine();
        boolean flag = false;
        int idDoc=0;
        for (Doctor d:
             hospital.getDoctors()) {
            if(d.getDni().equals(dni)){
                System.out.println("The doctor was delete");
                flag = true;
                break;
            }
            idDoc++;
        }
        if(flag) {
            hospital.getDoctors().remove(idDoc);
        }else{
            System.out.println("The doctor has not been found");
        }
    }




    public void atenddPatient(Hospital hospital){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the DNI of the patient you want to attend:");
        String dni = s.nextLine();
        boolean flag = false;
        Patient temp=null;
        interrupt:
        for (Patient p:
                hospital.getPatientsWaiting()) {
            if(p.getDni().equals(dni)){
                temp=p;
                for (Doctor d:
                     hospital.getDoctors()) {
                    if(p.getDisease().equals(d.getSpeciality())){
                        d.getAttendedPatient().add(p);
                        System.out.println("The patient: " +p.getName() +" " + p.getLastName() + " will be attended by: " + d.getName() + " " + d.getLastName());
                        hospital.getPatientsWaiting().remove(p);
                        flag = true;
                        break interrupt;
                    }
                }
            }
        }
        if(!flag){
            System.out.println("There is no doctor who treats his illness at the moment. We sorry. This patient will be entered in the list of patients not attended");
            hospital.getPatientUnattended().add(temp);
            hospital.getPatientsWaiting().remove(temp);
        }
    }

    public void menuPacientes(Hospital hospital){
        Scanner s = new Scanner(System.in);
        boolean flag = false;
        int opcion;
        while(!flag){
            System.out.println("This is the patients submenu, enter an options\n" +
                    "1- List waiting patients\n" +
                    "2- List patients treated\n" +
                    "3- List patients who were seen by a doctor\n" +
                    "4- List patients who could not be attended\n" +
                    "5- Back to Main Menu");
            try {
                opcion = s.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println(hospital.getPatientsWaiting());
                        break;
                    case 2:
                        for (Doctor d:
                             hospital.getDoctors()) {
                            System.out.println(d.getAttendedPatient());
                        };
                        break;
                    case 3:
                        submenuPacientes(hospital);
                        break;
                    case 4:
                        if(hospital.getPatientUnattended().size() > 0){
                            System.out.println(hospital.getPatientUnattended());
                        }else {
                            System.out.println("There are no patients on this list yet.\n");
                        }
                        break;
                    case 5:
                        flag = true;
                        break;
                    default:
                        System.out.println("invalid option");
                        break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                s.nextLine();
            }
        }
    }

    public void submenuPacientes(Hospital hospital){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the doctor's DNI: ");
        String dni = s.nextLine();
        boolean flag = false;
        for (Doctor d:
                hospital.getDoctors()) {
            flag = false;
            if(d.getDni().equals(dni)){
                if(d.getAttendedPatient().size() == 0) {
                    System.out.println("The doctor has not seen any patient yet\n");
                }else if(d.getAttendedPatient().size() >0){
                    System.out.println("The Doctor " + d.getName() + " " + d.getLastName() + " cared for the following patients: ");
                    for (Patient p:
                         d.getAttendedPatient()) {
                        System.out.println(p.name+" "+p.lastName);
                    }
                }
                break;
            }else{
                flag = true;
            }
        }
        if(flag){
            System.out.println("No doctor has been found with that DNI\n");
        }
    }

    public void addSpeciality(Hospital hospital){
        Pattern pat = Pattern.compile("[a-zA-Z]*");
        Scanner s = new Scanner(System.in);
        System.out.println("Indicates the new specialty");
        String speciality = s.nextLine().toUpperCase();
        Matcher mat = pat.matcher(speciality);
        if(mat.matches()) {
            hospital.getSpecialities().add(speciality);
            System.out.println("The specialty was added successfully\n");
        }else{
            System.out.println("Only letters can be entered. Do the operation again");
        }
    }
}

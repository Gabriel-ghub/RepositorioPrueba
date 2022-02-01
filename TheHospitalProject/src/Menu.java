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

            System.out.println("Bienvenido al sistema del Hospital, le rogamos que ingrese una opcion:");
            System.out.println(
                    "MENU:" + "\n" +
                            "1- Register patient\n" +
                            "2- Register doctor\n" +
                            "3- Modify patient\n" +
                            "4- Modify doctor\n" +
                            "5- Show all patients\n" +
                            "6- Show all doctors\n" +
                            "7- Delete doctor\n" +
                            "8 - Exit"
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
                        System.out.println(hospital.getPatientsWaiting());
                        break;

                    case 6:
                        System.out.println(hospital.getDoctors());
                        break;

                    case 7:
                        borrarDoctor(hospital);
                        break;


                    case 8:
                        salir = true;
                        break;

                    default:
                        System.out.println("Opcion invalida. Por favor eliga una opcion correcta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número");
                s.nextLine();
            }
        }
        System.out.println("Adiós Gracias");
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
            System.out.println("Ingrese el dni:");
            dniTemp = s.next();
            esValido = validarDniCorrecto(dniTemp, hospital);
            if(!esValido){
                break;
            }else{
                dni = dniTemp;
            }

            System.out.println("Numero de la Seguridad Social:");
            ssn = s.next();

            System.out.println("Nombre:");
            name = s.next();

            System.out.println("Apellido:");
            lastName = s.next();

            System.out.println("Edad:");
            age = s.nextInt();
            if(age<0 || age>120){
                System.out.println("No es posible asignar ese valor a la edad. Se cerrará la solicitud");
                break;
            }

            System.out.println("Telefono:");
            phone = s.nextInt();

            System.out.println("Enfermedad:");
            disease = s.next();

            Patient patient = new Patient(dni, ssn, name, lastName, age, phone, disease);
            return patient;
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
            System.out.println("Ingrese el dni:");
            dniTemp = s.next();
            esValido = validarDniCorrectoDoctor(dniTemp, hospital);
            if (!esValido) {
                break;
            } else {
                dni = dniTemp;
            }
            System.out.println("Nombre:");
            name = s.next();

            System.out.println("Apellido:");
            lastName = s.next();

            System.out.println("Edad:");
            age = s.nextInt();
            if(age<0 || age>120){
                System.out.println("No es posible asignar ese valor a la edad. Se cerrará la solicitud");
                break;
            }

            System.out.println("Especialidad:");
            specialityTemp = s.next();
            boolean especialidad = validarEspecialidad(specialityTemp,hospital);
            if(!especialidad){
               break;
            }else{
                speciality=specialityTemp;
            }

            System.out.println("Salario:");
            salary = s.nextDouble();

            Doctor doctor = new Doctor(dni, name, lastName, age, speciality, salary);
            return doctor;
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
            System.out.println("El dni no cumple con los parametros, recuerda que deben ser 8 digitos y una letra (La letra será validada)");
            return false;
        }else if(mat.matches()){
            String letraDni = dniTemp.substring(8,9).toUpperCase();
            int numDni = Integer.parseInt(dniTemp.substring(0,8));
            int posicionArray = numDni%23;
            if(!letraDni.equals(letra[posicionArray])){
                System.out.println("El dni no cumple con los parametros, recuerda que deben ser 8 digitos y una letra (La letra será validada.)");
                return false;
            }else{
                for (Patient p :
                        hospital.getPatientsWaiting()) {
                    if (dniTemp.equals(p.getDni())) {
                        System.out.println("El DNI ya existe.");
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
            System.out.println("El dni no cumple con los parametros, recuerda que deben ser 8 digitos y una letra (La letra será validada.)");
            return false;
        }else if(mat.matches()){
            String letraDni = dniTemp.substring(8,9).toUpperCase();
            int numDni = Integer.parseInt(dniTemp.substring(0,8));
            int posicionArray = numDni%23;
            if(!letraDni.equals(letra[posicionArray])){
                System.out.println("El dni no cumple con los parametros, recuerda que deben ser 8 digitos y una letra (La letra será validada.)");
                return false;
            }else{
                for (Doctor d :
                        hospital.getDoctors()) {
                    if (dniTemp.equals(d.getDni())) {
                        System.out.println("El DNI ya existe.");
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
                System.out.println("Este hospital no dispone de esa especialidad, no podrá registrarse, lo lamento.");
                return false;
            }else{
                return true;
            }
        }
        return false;
    }

    public void borrarDoctor(Hospital hospital){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el DNI del doctor que desea borrar:");
        String dni = s.nextLine();
        boolean flag = false;
        int idDoc=0;
        for (Doctor d:
             hospital.getDoctors()) {
            if(d.getDni().equals(dni)){
                System.out.println("El doctor ha sido eliminado");
                flag = true;
                break;
            }
            idDoc++;
        }
        if(flag) {
            hospital.getDoctors().remove(idDoc);
        }else{
            System.out.println("No se ha encontrado el Doctor");
        }
    }

}
import java.util.InputMismatchException;
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
                            "\n" +
                            "2- Register doctor\n" +
                            "\n" +
                            "3- Modify patient\n" +
                            "\n" +
                            "4- Modify doctor\n" +
                            "\n" +
                            "5- Show all patients\n" +
                            "\n" +
                            "6- Show all doctors\n" +
                            "\n" +
                            "7- Delete doctor\n" +
                            "\n" +
                            "8 - Exit"
            );

            try {
                opcion = s.nextInt();
                switch (opcion) {
                    case 1:
                        hospital.registerPatient(tomarDatosPaciente());
                        break;
                    case 2:
                        hospital.registerDoctor(tomarDatosDoctor());
                        break;
                    case 3:

                        break;

                    case 4:

                        break;

                    case 5:
                        System.out.println(hospital.getPatientsWaiting());
                        break;

                    case 6:
                        System.out.println(hospital.getDoctors());
                        break;

                    case 7:

                        break;


                    case 8:
                        salir = true;
                        break;

                    default:
                        System.out.println("Opcion invalida. Por favor eliga una opcion correcta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número");
                s.next();
            }
        }
        System.out.println("Adiós Gracias");

    }


    //METODO TOMAR DATOS PACIENTE

    public Patient tomarDatosPaciente() {
        Scanner s = new Scanner(System.in);
        String dni;
        String ssn;
        String name;
        String lastName;
        int age;
        int phone;
        String disease;
        System.out.println("Por favor, ingrese los datos del paciente: \n DNI:");
        dni = s.next();

        System.out.println("Numero de la Seguridad Social:");
        ssn = s.next();

        System.out.println("Nombre:");
        name = s.next();

        System.out.println("Apellido:");
        lastName = s.next();

        System.out.println("Edad:");
        age = s.nextInt();

        System.out.println("Telefono:");
        phone = s.nextInt();

        System.out.println("Enfermedad:");
        disease = s.next();

        Patient patient = new Patient(dni, ssn, name, lastName, age, phone, disease);
        return patient;
    }

    public Doctor tomarDatosDoctor() {
        Scanner s = new Scanner(System.in);
        String dni;
        String name;
        String lastName;
        int age;
        String speciality;
        double salary;
        System.out.println("Por favor, ingrese los datos del Doctor: \n DNI:");
        dni = s.next();

        System.out.println("Nombre:");
        name = s.next();

        System.out.println("Apellido:");
        lastName = s.next();

        System.out.println("Edad:");
        age = s.nextInt();

        System.out.println("Especialidad:");
        speciality = s.next();


        System.out.println("Salario:");
        salary = s.nextDouble();

        Doctor doctor = new Doctor(dni, name, lastName, age, speciality, salary);
        return doctor;
    }


    //METODO VALIDADOR DE DNI

    public String validarDni(String dni) {
        if(dni.length()!=9){
            return "DNI ERRONEO";
        }
        for(int i = 0; i < 8; i++){
            if(dni.charAt(i) != '0' ||dni.charAt(i) != '1'||dni.charAt(i) != '2'||dni.charAt(i) != '3'||dni.charAt(i) != '4'||dni.charAt(i) != '5'||dni.charAt(i) != '6'|| dni.charAt(i) != '7' || dni.charAt(i) != '8'|| dni.charAt(i) != '9'){
                return "DNI ERRONEO";
            }
        }
        if(){

        }
        String letra[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        return dni;
    }

}
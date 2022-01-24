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
        String dniTemp =s.next();
        while(dniTemp.length() !=9){
            System.out.println("Error de longitud, ingrese un DNI correcto:");
            dniTemp= s.next();
        }
        dni = validarDni(dniTemp);

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
        String dniTemp =s.next();
        while(dniTemp.length() !=9){
            System.out.println("Error de longitud, ingrese un DNI correcto:");
            dniTemp= s.next();
        }
        dni = validarDni(dniTemp);

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

        Scanner s = new Scanner(System.in);
        String dniTemp = dni;
        Pattern patron = Pattern.compile("[0-9]{7,8}[A-Za-z]");
        Matcher mat = patron.matcher(dniTemp);
        String letra[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int total = 0;
        String letraDni = dniTemp.substring(8,9).toUpperCase();
        for(int i = 0; i < 8; i++){
            total += Integer.parseInt(dniTemp.substring(i, i+1));
        }
        total /=23;
        while(!mat.matches() || !letraDni.equals(letra[total])){
            System.out.println("Dni incorrecto, introduce un dni correcto:");
            dniTemp= s.nextLine();
            total= 0;
            for(int i = 0; i < 8; i++){
                total += Integer.parseInt(dniTemp.substring(i, i+1));
            }
            total /=23;
            letraDni = dniTemp.substring(8,9).toUpperCase();
            mat = patron.matcher(dniTemp);
        }
        return dniTemp;
    }
}
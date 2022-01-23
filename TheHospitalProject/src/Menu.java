import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {


    public static void main(String[] args) {
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


                        break;
                    case 2:

                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    case 5:

                        break;

                    case 6:

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
}

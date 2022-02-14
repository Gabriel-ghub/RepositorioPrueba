package EjemploPersona;

public class Test {
    public static void main(String[] args) {
        Persona e1 = new Empleado("Javier", 1451);
        Persona e2 = new Empleado("Omar Algo anda Mal", 14542221);
        Persona a1 = new Alumno("Tu viejita", "Programacion");
        System.out.println(e1.dameDescripcion());
        System.out.println(e2.dameDescripcion());
        System.out.println(a1.dameDescripcion());



    }
}

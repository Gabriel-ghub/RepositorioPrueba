package EjemploPersona;


public class Empleado extends Persona{
    private double sueldo;
    private static int idSiguiente;
    private int id;

    public Empleado(String nom, double sueldo){
        super(nom);
        this.sueldo = sueldo;
        ++idSiguiente;
        id = idSiguiente;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void subirSueldo(){
        sueldo+=1500;
    }

    @Override
    public String dameDescripcion() {
        return "El sueldo es: " + this.getSueldo() +"y el ID es:" + this.id+ " y el nombre es: " + this.getNombre();
    }
}

package EjemploPersona;

public class Alumno extends Persona {
    private String carrera;

    public Alumno(String nombre,String carrera) {
        super(nombre);
        this.carrera = carrera;
    }


    @Override
    public String dameDescripcion() {
        return "El nombre del EjemploPersona.Alumno es "+ getNombre() + " carrera: "+ carrera;
    }
}

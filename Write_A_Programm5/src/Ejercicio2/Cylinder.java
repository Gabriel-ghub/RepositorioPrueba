package Ejercicio2;

public class Cylinder extends Circle {
    private double height;


    public Cylinder(){
        //super();
        super.setColor("green");
        super.setRadius(6);
        height= 1.0;
    }

    public Cylinder(double height){
        super();
        this.height= height;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }


    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' + super.toString();
    }
}

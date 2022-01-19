package Ejercicio4;

public class Circle extends Shape {
    double radius =1.0;

    public Circle(){};

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
}

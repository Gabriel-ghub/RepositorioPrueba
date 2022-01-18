package Ejercicio2;

public class Circle {
    private double radius;
    private String color;


    public Circle() {
        radius= 1.0;
        color= "red";
    }

    public Circle(double r){
        radius = r;
        color= "red";
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius*radius+Math.PI;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

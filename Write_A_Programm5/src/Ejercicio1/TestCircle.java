package Ejercicio1;

import static java.time.Clock.system;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setColor("Green");
        Circle c2 = new Circle(2.0);
        c2.setColor("Brown");

//        Pruebas Circle 1
        System.out.println("The circle 1 has radius of " + c1.getRadius()+ " and area of " + c1.getArea());
        System.out.println("The color of circle 1 is "+ c1.getColor());
        System.out.println(c1.toString());


//        Pruebas Circle 2
        System.out.println("The circle 2 has radius of " + c2.getRadius()+ " and area of " + c2.getArea());
        System.out.println("The color of Circle 2 is "+ c2.getColor());
        System.out.println(c2.toString());
    }
}

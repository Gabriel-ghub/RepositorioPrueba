package Ejercicio4;

public class TestCircleAndRectangle {

    public static void main(String[] args) {

//        RECTANGLE
        Rectangle r1 = new Rectangle(1.5,1.7,"Yellow" , true);
        System.out.println(r1.toString());
        System.out.println("El area del rectangulo es " + r1.getArea());
        System.out.println("El perimetro del rectangulo es " + r1.getPerimeter());


//        CIRCLE
        Circle c1 = new Circle();
        System.out.println(c1.toString());
        System.out.println("El area del circulo es "+ c1.getArea());
        System.out.println("El perimetro del circulo es "+ c1.getPerimeter());


    }
}

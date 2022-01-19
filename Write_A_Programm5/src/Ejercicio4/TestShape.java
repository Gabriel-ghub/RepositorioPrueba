package Ejercicio4;

public class TestShape {

    public static void main(String[] args) {

        Shape shape1 = new Shape();
        System.out.println(shape1.toString());

        shape1.setColor("brown");
        System.out.println(shape1.toString());

        shape1.setColor("brown");
        System.out.println(shape1.isFilled());



    }
}

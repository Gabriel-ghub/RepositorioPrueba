package Ejercicio2;

public class TestCylinder {
    public static void main(String[] args) {

//        Pruebas cilindro 1
        Cylinder c1 = new Cylinder(5, 3);
        System.out.println(c1.toString());
        System.out.println(c1.getHeight());
        System.out.println(c1.getVolume());

//        Pruebas cilindro 2
        Cylinder c2 = new Cylinder();
        System.out.println(c2.toString());
        System.out.println(c2.getHeight());
        System.out.println(c2.getVolume());

//        Pruebas cilindro 3
        Cylinder c3 = new Cylinder(2);
        System.out.println(c3.toString());
        System.out.println(c3.getHeight());
        System.out.println(c3.getVolume());

//        Pruebas cilindro 4
        Cylinder c4 = new Cylinder(2);
        System.out.println(c4.toString());

    }
}

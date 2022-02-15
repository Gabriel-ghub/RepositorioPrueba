package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Producto1",10);
        Producto p2 = new Producto("Producto2",20);
        Producto p3 = new Producto("Producto3",30);

        System.out.println("PRUEBA PRODUCTOS");
        System.out.println(p1.toString());
        System.out.println("El precio final es de: " + p1.calcularPrecioFinal(2));
        p1.setPrecio(100);
        System.out.println("Prueba get precio: "+ p1.getPrecio());
        System.out.println(p2.toString());
        System.out.println("El precio final es de: " + p2.calcularPrecioFinal(3));
        p2.setPrecio(200);
        System.out.println("Prueba get precio: "+ p2.getPrecio());
        System.out.println(p3.toString());
        System.out.println("El precio final es de: " + p3.calcularPrecioFinal(4));
        p3.setPrecio(300);
        System.out.println("Prueba get precio: "+ p3.getPrecio());

        Perecedero pe1 = new Perecedero("Carne1",50, 1);
        Perecedero pe2 = new Perecedero("Carne2",60, 2);
        Perecedero pe3 = new Perecedero("Carne3",70, 3);

        System.out.println("\n\nPRUEBA PRODUCTOS PERECEDEROS");
        System.out.println(pe1.toString());
        System.out.println("El precio final es de: " + pe1.calcularPrecioFinal(1));
        pe1.setPrecio(100);
        System.out.println("Prueba get precio: "+ pe1.getPrecio());
        System.out.println(pe2.toString());
        System.out.println("El precio final es de: " + pe2.calcularPrecioFinal(2));
        pe2.setPrecio(200);
        System.out.println("Prueba get precio: "+ pe2.getPrecio());
        System.out.println(pe3.toString());
        System.out.println("El precio final es de: " + pe3.calcularPrecioFinal(3));
        pe3.setPrecio(300);
        System.out.println("Prueba get precio: "+ pe2.getPrecio());

        NoPerecedero np1 = new NoPerecedero("Arroz1", 10,"NP - 1");
        NoPerecedero np2 = new NoPerecedero("Arroz2", 20,"NP - 2");
        NoPerecedero np3 = new NoPerecedero("Arroz3", 30,"NP - 3");

        System.out.println("\n\nPRUEBA PRODUCTOS NO-PERECEDEROS");
        System.out.println(np1.toString());
        System.out.println("El precio final es de: " + np1.calcularPrecioFinal(1));
        np1.setPrecio(100);
        System.out.println("Prueba get precio: "+ np1.getPrecio());
        System.out.println(np2.toString());
        System.out.println("El precio final es de: " + np2.calcularPrecioFinal(2));
        np2.setPrecio(200);
        System.out.println("Prueba get precio: "+ np2.getPrecio());
        System.out.println(np3.toString());
        System.out.println("El precio final es de: " + np3.calcularPrecioFinal(3));
        np3.setPrecio(300);
        System.out.println("Prueba get precio: "+ np3.getPrecio());
    }
}

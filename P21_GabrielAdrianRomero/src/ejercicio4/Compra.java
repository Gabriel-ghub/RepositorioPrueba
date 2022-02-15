package ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Compra {
    public ArrayList<Producto> productos = new ArrayList<Producto>();

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double calculateTotal(){
        double total= 0;
        for (Producto p:
             productos) {
            total += p.cantidad * p.precio;
        }
        return total;
    };

    public void mostrarTicket(){
        System.out.println("Producto-----Cantidad-----precio-----Total");
        for (Producto p:
             productos) {

            System.out.print(p.nombre+"-----");
            System.out.print(p.cantidad+"-----------");
            System.out.print(p.precio+"----------");
            System.out.println(p.cantidad* p.precio);
        }
        System.out.println("Total: -----------------------------" + calculateTotal());
    };

    public static void main(String[] args) {
        Compra c1 = new Compra();

        Scanner s = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        while(!salir) {
            System.out.println("Bienvenido al super!");
            System.out.println(
                    "MENU:" + "\n" +
                            "1- Añadir Producto\n" +
                            "2- Mostrar Total\n" +
                            "3- Mostrar Ticket\n" +
                            "4- Exit\n"
            );
            opcion = Integer.parseInt(s.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del Producto a añadir : ");
                    String name = s.nextLine();
                    c1.getProductos().add(new Producto(name));
                    break;
                case 2:
                    System.out.println("El total es de: " + c1.calculateTotal());
                    break;
                case 3:
                    System.out.println("Su ticket es el siguiente: ");
                    c1.mostrarTicket();
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }
        System.out.println("Adios Gracias!");

    }
}


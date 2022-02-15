package ejercicio4;

public class Producto {
    String nombre;
    int cantidad = (int) ((Math.random()*50)+1);
    int precio = (int) ((Math.random()*10)+1);


    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}
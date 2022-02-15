package ejercicio2;

public class Perecedero extends Producto {
    int diasCaducidad;

    public Perecedero(String nombre, double precio, int diasCaducidad) {
        super(nombre, precio);
        this.diasCaducidad = diasCaducidad;
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(int diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }

    @Override
    public void setPrecio(double precio) {
        super.setPrecio(precio);
    }

    @Override
    public String toString() {
        return super.toString() + " Dias de caducidad "+ this.diasCaducidad;
    }


    @Override
    public double calcularPrecioFinal(int cantidad) {
        double resultado = 0;
        if(this.diasCaducidad == 1){
            resultado = super.calcularPrecioFinal(cantidad)/4;
        }else if(this.diasCaducidad == 2){
            resultado = super.calcularPrecioFinal(cantidad)/3;
        }else if(this.diasCaducidad == 3){
            resultado = super.calcularPrecioFinal(cantidad)/2;
        }
        return resultado;
    }
}




package Ejercicio6;

public abstract class Factura {
    int id;
    double importe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public abstract double getImporteIva();
}

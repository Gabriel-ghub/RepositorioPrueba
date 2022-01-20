package Ejercicio6;

public class FacturaIVAReducido extends Factura{
    private double iva = 0.1;

    @Override
    public double getImporteIva() {
        return 0;
    }
}

package Ejercicio6;

public class FacturaIVA extends Factura {
    private double iva = 0.21;

 public FacturaIVA(int id, double importe){
     super();
     this.setImporte(importe);
     this.setId(id);
 }

    @Override
    public double getImporteIva() {
        return super.getImporte()*iva;
    }
}

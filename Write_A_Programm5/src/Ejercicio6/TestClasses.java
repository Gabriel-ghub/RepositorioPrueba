package Ejercicio6;

public class TestClasses {

    public static void main(String[] args) {
        FacturaIVA f1 = new FacturaIVA(12,2.2);
        System.out.println(f1.setImporte(3098));
        System.out.println(f1.getImporteIva());

    }
}

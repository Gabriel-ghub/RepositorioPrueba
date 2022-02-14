package ejemploAccount;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        CurrentAccount a1 = new CurrentAccount("Sergio Castillo",123,15000000,12);
        Account prueba = new CurrentAccount("Sergio Castillo",123,15000000,12);
        CurrentAccount a2= new CurrentAccount("Lalalala",123,15000000,12);
        CurrentAccount a3= new CurrentAccount("FEEFEF",123,15000000,12);
        a1.calculateInterest();
        System.out.println(a1.getFinalBalance());
        System.out.println(a2.getFinalBalance());
        System.out.println(a3.getFinalBalance());
        System.out.println(a1.getId());
        System.out.println(((CurrentAccount) prueba).getId());
        System.out.println(a2.getId());
        System.out.println(a3.getId());

        HashMap<String, String>h1 = new HashMap<String, String>();
    }

}

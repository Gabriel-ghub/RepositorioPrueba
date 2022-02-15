package ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Ejercicio1 {


   public static int[] contarDigitos(int[] entrada){
        //HashSet<Integer> temporal = new HashSet<Integer>();

        int [] resultado = new int[entrada.length];
        for(int i = 0; i < entrada.length; i++){
            resultado[i] = String.valueOf(entrada[i]).length();
        }
        return resultado;
    }

    public static void main(String[] args) {

        int [] entrada1 = {1,22,333,4444,55555,666666};
        int [] entrada2 = {123,1234,12345,123456};
        int [] entrada3 = {1,12,123};
        int [] entrada4 = {1,12};
        int [] entrada5 = {};

        //CASOS DE PRUEBA
        System.out.println(Arrays.toString(contarDigitos(entrada1)));
        System.out.println(Arrays.toString(contarDigitos(entrada2)));
        System.out.println(Arrays.toString(contarDigitos(entrada3)));
        System.out.println(Arrays.toString(contarDigitos(entrada4)));
        System.out.println(Arrays.toString(contarDigitos(entrada5)));
    }
}

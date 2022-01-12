package Ejercicios;

import java.util.HashMap;

public class Ejercicio12 {

    public static void main(String[] args) {
        int [] arr = {2, 4 , 2 , 5 , 5 , 5, -1};

        System.out.println(method1(arr));
    }
    public static HashMap<Integer, Integer> method1 (int [] arr){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int k : arr) {
            int contador = 0;
            for (int i : arr) {
                if (!map.containsKey(k)) {
                    map.put(k, 0);
                }
                if (k == i) {
                    contador++;
                }
            }
            map.replace(k, contador);
        }
        return map;
    }
}

package Ejercicios;

import java.util.HashSet;

public class Ejercicio9 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(9);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set1.add(4);
        set1.add(5);
        set1.add(6);

        HashSet <Integer> result = new HashSet<Integer>();
        result = union(set1, set2);
        System.out.println(result);
    }
    public static HashSet<Integer> union(HashSet<Integer> set1, HashSet<Integer> set2 ){
        set1.addAll(set2);
        return set1;
    }
}

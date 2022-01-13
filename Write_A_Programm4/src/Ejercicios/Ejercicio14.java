package Ejercicios;

import java.util.Calendar;
import java.util.HashMap;

public class Ejercicio14 {
  /*  public HashMap<String, Calendar> diary;

    public Ejercicio14(){
        diary = new HashMap<String, Calendar>();
    }
    public void addEjercicio14(String name, int day, int month, int year){

    }
    public Calendar getEjercicio14for(String name){


    }
    public void printEjercicio14(){

    }
*/
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
    }
}

package Ejercicios;

import java.util.Calendar;
import java.util.HashMap;

public class Ejercicio14 {
  public HashMap<String, Calendar> diary;

    public Ejercicio14(){
        this.diary = new HashMap<String,Calendar>();
    }
    public void addBirthday(String name, int day, int month, int year){
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        diary.put(name, cal);
    }
    public Calendar getBirthdayFor(String name){
        return diary.get(name);
    }
    public void printDiary(){
        System.out.println(diary);
    }

    public static void main(String[] args) {
        Ejercicio14 d1 = new Ejercicio14();
        d1.addBirthday("Laura", 12,12,12);
        d1.addBirthday("Marcos", 13, 5,24);
        //d1.printDiary();
        System.out.println(d1.getBirthdayFor("Laura"));
    }
}

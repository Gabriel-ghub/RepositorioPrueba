package Ejercicio3;

public class TestAuthor {


    public static void main(String[] args) {
        System.out.println();
        Author a1 = new Author("Dan Brown", "danbr@gmail.com", 'f');
        System.out.println(a1.toString());
        System.out.println(a1.getEmail());
        System.out.println(a1.getName());
        System.out.println(a1.getGender());

    }
}

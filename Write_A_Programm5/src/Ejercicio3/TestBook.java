package Ejercicio3;

public class TestBook {

    public static void main(String[] args) {
        Author a1 = new Author("Dan Brown", "danbr@gmail.com", 'f');

        Book b1 = new Book("Inferno", a1 , 2.3);
        System.out.println(b1.toString());

    }

}

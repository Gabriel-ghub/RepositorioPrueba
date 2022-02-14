public class TestRestaurant {

    public static void main(String[] args) {
        Food f1 = new Falafel(17);
        System.out.println(f1.toString());
        Food f2 = new Pizza(2);
        System.out.println(f2.toString());
        Food f3 = new Hamburger(18);
        System.out.println(f3.toString());
    }
}

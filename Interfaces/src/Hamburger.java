public class Hamburger extends Food {
    Hamburger(long cal) {
        super(cal);
    }

    @Override
    long getCalories() {
        return super.getCalories();
    }

    @Override
    public String toString() {
        return super.toString() + " De la hamburguesa ";
    }
}

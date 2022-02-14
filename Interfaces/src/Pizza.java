public class Pizza extends Food{
    Pizza(long cal) {
        super(cal);
    }

    @Override
    long getCalories() {
        return super.getCalories();
    }

    @Override
    public String toString() {
        return super.toString() + " De la pizza";
    }
}

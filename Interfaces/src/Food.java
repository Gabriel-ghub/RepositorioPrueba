public class Food implements Comparable{
    private long calories;
    Food(long cal)
    {
        calories = cal;
    }
    long getCalories()
    {
        //add the missing code
        return 2;
    }
    public int compareTo(Object other)
    {
        Food aComparar = (Food) other;
        if(this.calories < aComparar.calories){
            return -1;
        }
        if(this.calories > aComparar.calories){
            return 1;
        }
        else {return 0;}

    }

    @Override
    public String toString() {
        return "Food{" +
                "calories=" + calories +
                '}';
    }
}

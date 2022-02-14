import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String n1 ="holac";
        String n2 = "holab";
        String n3 = "holaa";

        String [] arr = new String [3];
        arr [0]= n1;
        arr [1]= n2;
        arr [2]= n3;

        Arrays.sort(arr);

        System.out.print(Arrays.toString(arr));

    }
}

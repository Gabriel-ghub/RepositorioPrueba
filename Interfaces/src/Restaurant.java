import java.util.Arrays;

public class Restaurant {
    public static void main(String args[])
    {
        Food vec[] = new Food[10];
        for(int index=0; index<vec.length; index++)
        {

            int num = (int) (Math.random() * 3)+1;
            if(num == 1){
                vec[index]= new Hamburger((long) (Math.random()*25));
            }else if (num ==2){
                vec[index]= new Pizza((long) (Math.random()*25));
            }else{
                vec[index]= new Falafel((long) (Math.random()*25));
            }
        }

        Arrays.sort(vec);

        for(int index=0; index<vec.length; index++)
        {
            System.out.println(vec[index]);
        }


    }
}

package ArrayList_basic;
import java.util.ArrayList;
import java.util.Arrays;
public class MyArrayList
{

    public static void main(String[] args)
    {


        ArrayList<String> arr1=new ArrayList<>();

        arr1.add("Apple");
        arr1.add("Orange");
        arr1.add("Kwivi");
        arr1.add("Grapes");
        arr1.add("Pineapple");

        for(String s:arr1)
        {
            System.out.println(s);
        }


    }
}

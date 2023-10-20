import java.util.HashMap;

public class num_striing
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> numbers=new HashMap<>();
        numbers.put(0,"Zero");
        numbers.put(1,"One");
        numbers.put(2,"Two");
        numbers.put(3,"Three");
        numbers.put(4,"Four");
        numbers.put(5,"Five");
        numbers.put(6,"Six");
        numbers.put(7,"Seven");
        numbers.put(8,"Eight");
        numbers.put(9,"Nine");

        int num=462364;
        int num_rev=0;
        int digit;

        while(num!=0)
        {
            num_rev=(num_rev*10)+num%10;
            num=num/10;
        }

        System.out.println(num);
        System.out.println(num_rev);

        while(num_rev!=0)
        {
            digit=num_rev%10;

            System.out.print(numbers.get(digit)+" ");
            num_rev=num_rev/10;
        }



    }
}

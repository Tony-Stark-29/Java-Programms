import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Main m=new Main();
        for(int i=0;i<=500;i++)
        {
            if(m.check_condition(i))
            {
                System.out.println(i);
            }
        }
    }

    int sum(ArrayList<Integer> arr1)
    {
        int sum=0;
        for (int i=0;i<arr1.size();i++)
        {
            sum+=arr1.get(i);
        }
        return sum;
    }
    boolean check_condition(int n)
    {
        int num=n;

        ArrayList<Integer> arr1=new ArrayList<>();

        while(num>0)
        {
            arr1.add(num%10);
            num=num/10;
        }

        for (int i=0;i<arr1.size();i++)
        {
            for (int j=i+1;j<arr1.size();j++)
            {
                if(arr1.get(i)==arr1.get(j))
                {

                    if (n>0 && n<=500 && sum(arr1)<=5)
                    {
                        return true;
                    }

                }
            }
        }

        return false;
    }
}
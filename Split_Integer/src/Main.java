import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main
{

    public void Split_Inputs(int n)
    {
        HashMap<Integer,Integer> num= new HashMap<Integer,Integer>();
        int number=n;
        int len= (Integer.toString(n)).length();
        while (number>0)
        {
            num.put(len--,number%10);
            number/=10;
        }

        int Zeros=1,size=num.size()-1;
        int balance=0;
        while(size>0)
        {
            Zeros*=10;
            size--;
        }

        if(num.size()>=4)
        {
            for(int i=1;i<=num.get(1);i++)
            {
                System.out.println(i*Zeros);
            }


            for(int j=2;j<=num.size();j++)
            {
                balance=balance*10+num.get(j);
            }
            System.out.println(balance);
        }
        else
        {
            for(int j=1;j<=num.size();j++)
            {
                balance=balance*10+num.get(j);
            }
            System.out.println(balance);
        }

    }
    public static void main(String[] args)
    {
        Main m=new Main();
        m.Split_Inputs(51450);
    }
}
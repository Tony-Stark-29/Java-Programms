package GFG.Day2;

import java.sql.SQLOutput;

public class GCD
{

    public static int GCD(int n1,int n2)
    {
        int result=1;
        int lar=n1>n2?n1:n2;
        for(int i=1;i<=lar;i++)
        {
            if(n1%i == 0 & n2%i==0)
            {
                result=i;
            }
        }

        return result;
    }

    public static int GCD2(int n1,int n2)
    {
        n1=n1>0?n1:-n1;
        n2=n2>0?n2:-n2;

        while(n1!=n2)
        {
            if(n1>n2)
            {
                n1-=n2;
            }
            else
            {
                n2-=n1;
            }
        }

        return n1;
    }
    public static void main(String[] args)
    {
        System.out.println(GCD(2,6));
        System.out.println(GCD(3,6));
        System.out.println(GCD(1,1));

        System.out.println( GCD2(2,6));
        System.out.println( GCD2(3,6));
        System.out.println( GCD2(1,1));


    }
}

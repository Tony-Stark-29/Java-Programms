package GFG.Day2;

public class LCM
{
    public static int GCD(int n1,int n2)
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

    public static int LCM(int n1,int n2)
    {
        return (n1*n2)/ GCD(n1,n2);
    }
    public static void main(String[] args)
    {
        System.out.println(LCM(72,120));
    }
}

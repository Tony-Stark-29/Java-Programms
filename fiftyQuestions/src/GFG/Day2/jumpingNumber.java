package GFG.Day2;

public class jumpingNumber
{
    public static int jumping(int n)
    {
        int lar=0;
        if(n<=10)
        {
            return n;
        }
        else
        {
            for(int i=11;i<=n;i++)
            {
                int num=i;
                int diff=0;
                while(num!=0)
                {
                    diff-=(num%10);
                    diff=Math.abs(diff);
                    num/=10;
                }

                if(Math.abs(diff)==1)
                {
                    lar=i;
                }
            }
            return lar;
        }

    }

    public static void main(String[] args)
    {

        System.out.println(jumping(10));
        System.out.println(jumping(50));

    }
}

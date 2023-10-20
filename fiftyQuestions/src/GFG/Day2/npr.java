package GFG.Day2;

public class npr
{
    public static long nPr(long n,long r)
    {

        return factorial(n)/factorial(n-r);

    }

    public static long factorial(long num)
    {
        if(num==0)
        {
            return 1;
        }
        return num*factorial(num-1);
    }


    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(nPr(2,1));
        System.out.println(nPr(3,3));
    }
}

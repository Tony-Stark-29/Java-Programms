package GFG.Day2;
import GFG.Day2.npr.*;
public class ncr
{
    public static long nCr(long n ,long r)
    {

        if(r>n)
        {
            return 0;
        }
        return npr.factorial(n)/((npr.factorial(r)*npr.factorial(n-r)));
    }

    public static void main(String[] args) {
        System.out.println(nCr(3,2));
        System.out.println(nCr(2,4));
    }
}

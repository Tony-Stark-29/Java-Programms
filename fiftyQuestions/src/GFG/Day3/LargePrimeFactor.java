package GFG.Day3;
import GFG.Day3.primeNumber.*;
public class LargePrimeFactor
{
    public static int PrimeFactor(int num)
    {
        int lar=1;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0 && primeNumber.isPrime(i))
            {
                 lar=i;
            }
        }
        return lar;
    }

    public static void main(String[] args)
    {

        System.out.println( PrimeFactor(24));

    }
}

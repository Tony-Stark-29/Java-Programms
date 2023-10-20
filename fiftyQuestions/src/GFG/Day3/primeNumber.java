package GFG.Day3;

public class primeNumber
{
    public static boolean isPrime(int num)
    {
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(isPrime(2));
        System.out.println(isPrime(4));
        System.out.println(isPrime(3));
    }
}

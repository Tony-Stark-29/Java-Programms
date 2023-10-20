package GFG.Day3;


import static GFG.Day3.primeNumber.isPrime;

public class PerfectNumber
{
    public static boolean isPerfect(int num)
    {
        int sum=1;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0 && isPrime(i))
            {
                sum+=i;
            }
        }

        return sum==num?true:false;
    }

    public static void main(String[] args)
    {

        System.out.println(isPerfect(10));
        System.out.println(isPerfect(6));

    }
}

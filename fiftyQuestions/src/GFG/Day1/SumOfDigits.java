package GFG.Day1;

public class SumOfDigits
{
    public static int SOD(int num)
    {
        int sum=0;
        while(num!=0)
        {
            sum+=(num%10);
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args)
    {

        System.out.println(SOD(123));
        System.out.println(SOD(456));

    }
}

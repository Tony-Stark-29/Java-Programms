package Numbers;

public class Negative
{


    public boolean isNegative(int n)
    {
        System.out.println((n & (1<<31)));
        return (n & (1<<31))!=0;
    }

    public int convertToNegative(int n)
    {
        return ~n + 1;
    }

}

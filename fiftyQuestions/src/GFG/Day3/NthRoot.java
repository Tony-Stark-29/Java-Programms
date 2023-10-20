package GFG.Day3;

public class NthRoot
{

    public static int Root(int n,int num)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=(num/n);
        }

        return sum==num 

    }
    public static void main(String[] args) {

    }
}

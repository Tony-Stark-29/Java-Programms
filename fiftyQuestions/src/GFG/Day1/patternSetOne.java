package GFG.Day1;

public class patternSetOne
{

    public static void printPattern(int num)
    {

        for(int i=num;i>=1;i--)
        {
            int n=num;
            for(int j=1;j<=num*num;j++)
            {
                while(n!=0)
                {
                    for(int k=1;k<=i;k++)
                    {
                        System.out.print(n);
                    }
                    n--;
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {

        printPattern(4);

    }
}

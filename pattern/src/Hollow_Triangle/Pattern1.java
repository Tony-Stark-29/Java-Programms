package Hollow_Triangle;
public class Pattern1
{
    public static void main(String args[])
    {
        int n=10;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                if(row==col || row==n || col==1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

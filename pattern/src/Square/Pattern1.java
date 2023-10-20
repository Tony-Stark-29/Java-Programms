package Square;

public class Pattern1
{
    public static void main(String args[])
    {
        int n=10;

        for(int row=1;row<=n;row++)
        {
            for (int col=1;col<=n;col++)
            {
                if(row==1 || col==n || col==1 || row==n)
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

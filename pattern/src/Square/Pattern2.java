package Square;
public class Pattern2
{
    public static void main(String args[])
    {
        int n=11;

        for(int row=1;row<=n;row++)
        {
            for (int col=1;col<=n;col++)
            {
                if(row==1 || col==n || col==1 || row==n || row==col || (n-row+1==col))
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

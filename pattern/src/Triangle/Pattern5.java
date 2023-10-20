package Triangle;

public class Pattern5 {
    public static void main(String args[])
    {
        int n=10;
        int space=n-1;

        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            space--;
            System.out.println();
        }

    }
}

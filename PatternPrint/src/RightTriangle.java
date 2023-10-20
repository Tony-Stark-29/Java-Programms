import java.util.Scanner;

public class RightTriangle
{
    public static void main(String[] args)
    {

        int n=0;
        Scanner read=new Scanner(System.in);
        System.out.print("Num : ");
        n=read.nextInt();

        for(int i=1;i<=n;i++)
        {
             for(int s=n-i;s>0;s--)
             {
                 System.out.print("   ");
             }
             for (int j=1;j<=i;j++)
             {
                 System.out.print(" * ");
             }
            System.out.println();
        }

    }
}

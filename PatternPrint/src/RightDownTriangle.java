import java.util.Scanner;

public class RightDownTriangle
{
    public static void main(String[] args)
    {

        int n=0;
        Scanner read=new Scanner(System.in);
        System.out.print("Num : ");
        n=read.nextInt();

        for(int i=n;i>0;i--)
        {

            for (int s=n-i;s>0;s--)
            {
                System.out.print("   ");
            }

            for(int j=i;j>0;j--)
            {
                System.out.print(" * ");
            }

            System.out.println();
        }

    }
}

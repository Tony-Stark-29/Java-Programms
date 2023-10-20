import java.util.Scanner;

public class LeftTriangle
{
    public static void main(String[] args)
    {

        int n=0;
        Scanner read=new Scanner(System.in);
        System.out.print("Num : ");
        n=read.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}

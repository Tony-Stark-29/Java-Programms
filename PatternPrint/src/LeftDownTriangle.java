import java.util.Scanner;

public class LeftDownTriangle
{
    public static void main(String[] args)
    {

        int n=0;
        Scanner read=new Scanner(System.in);
        System.out.print("Num : ");
        n=read.nextInt();

        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}

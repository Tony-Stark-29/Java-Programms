import java.util.Scanner;

public class Pattern_Inverted_Right_Triangel
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter n Value : ");
        int n=scan.nextInt();

        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

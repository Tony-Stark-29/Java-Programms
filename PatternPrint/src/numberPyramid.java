import java.util.Scanner;

public class numberPyramid
{
    public static void main(String[] args)
    {

        Scanner read=new Scanner(System.in);
        System.out.print("Rows : ");
        int n=read.nextInt();

        for (int row=1;row<=n;row++)
        {
            for (int space=1;space<=(n-row);space++)
            {
                System.out.print(" ");
            }
            for(int num=1;num<=row;num++)
            {
                System.out.print(num);
            }
            if(row>1)
            {
                for (int rev=row-1;rev>=1;rev--)
                {
                    System.out.print(rev);
                }
            }
            System.out.println();
        }

    }
}

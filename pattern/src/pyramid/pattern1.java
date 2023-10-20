package pyramid;

public class pattern1
{
    public static void main(String args[])
    {
        int n=5;
        int star=1;
        for(int row=1;row<=n;row++)
        {
            for(int space=n-row;space>0;space--)
            {
                System.out.print(" ");
            }
            for(int pattern=1;pattern<=star;pattern++)
            {
                System.out.print("*");
            }
            System.out.println();
            star+=2;
        }
    }

}

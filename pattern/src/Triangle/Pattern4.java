package Triangle;

public class Pattern4
{
    public static void main(String args[])
    {
        int n=10;
        int space=0;
        for(int i=n;i>0;i--)
        {
            if(i!=n && space>0)
            {
                for(int s=1;s<=space;s++)
                {
                    System.out.print(" ");
                }
            }
            for(int j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
            space++;
        }
    }
}

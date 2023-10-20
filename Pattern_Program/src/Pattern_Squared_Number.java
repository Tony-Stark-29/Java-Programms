public class Pattern_Squared_Number
{
    public static void main(String[] args)
    {
        int n=7,len=2*n-1;

        for(int i=0;i<(2*n-1);i++)
        {
            for (int j=0;j<(2*n-1);j++)
            {
                int min=i<j?i:j;
                min=min<len-i ? min:len-i-1;
                min=min<len-j-1 ? min:len-j-1;

                System.out.print(n-min+"  ");
            }
            System.out.println();
        }

    }
}

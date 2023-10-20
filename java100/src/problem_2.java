public class problem_2
{

    public static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {

            for(int space=n-row;space >=1;space--)
            {
                System.out.print(" ");
            }

            for(int col=1;col<=row;col++)
            {
                System.out.print(row+" ");
            }

            System.out.println();

        }
    }


    public static void pattern2(int n)
    {

        for(int row=1;row<=n;row++)
        {

            for(int space=n-row;space >=1;space--)
            {
                System.out.print(" ");
            }

            for(int col=1;col<=row;col++)
            {
                System.out.print(col+"  ");
            }

            System.out.println();

        }

    }
    public static void pattern3(int n)
    {

        for(int row=1;row<=n;row++)
        {

            for(int space=n-row;space >=1;space--)
            {
                System.out.print(" ");
            }

            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

    public static void pattern4(int n)
    {

        for(int row=1;row<=n;row++)
        {

            for(int space=n-row;space >=1;space--)
            {
                System.out.print(" ");
            }

            for(int left=1;left<row;left++)
            {
                System.out.print(left);
            }
            System.out.print(row);
            for(int right=row-1;right>=1;right--)
            {
                System.out.print(right);
            }

            System.out.println();

        }

    }


    public static void pattern6(int noOfRows)
    {
        for (int i = noOfRows; i >= 1; i--)
        {
            //Printing i*2 spaces at the beginning of each row

            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }

            //Printing j where j value will be from i to noOfRows

            for (int j = i; j <= noOfRows; j++)
            {
                System.out.print(j+" ");
            }

            //Printing j where j value will be from noOfRows-1 to i

            for (int j = noOfRows-1; j >= i; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();

            //Incrementing the rowCount


        }
    }

    public static void main(String[] args) {
        pattern1(9);
        pattern2(9);
        pattern3(9);
        pattern4(9);
        pattern6(9);
    }

}

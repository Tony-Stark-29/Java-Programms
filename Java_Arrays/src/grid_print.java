public class grid_print
{
    public static void main(String args[])
    {
        int[][] num=new int[10][10];
        num[1][0]=0;
        num[9][9]=10;

        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}

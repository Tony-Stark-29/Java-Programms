package GFG.Day3;

public class Cubes
{

    public static int PairCubeCount(int n)
    {
        int pair=0;
        for(int i=1;cube(i)<=n;i++)
        {
            for(int j=0;j*j*j <=n;j++)
            {
                if( cube(i) +cube(j) == n )
                {
                    pair++;
                }
            }
        }
    return pair;
    }

    public static long cube(long n)
    {
        return n*n*n;
    }

    public static void main(String[] args) {
        System.out.println(PairCubeCount(9));
        System.out.println(PairCubeCount(27));
    }
}

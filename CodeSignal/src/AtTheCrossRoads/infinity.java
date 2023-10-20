package AtTheCrossRoads;

public class infinity
{
    public static void main(String args[])
    {
        infinity in=new infinity();

        System.out.println(in.findInfinity(2,6));
    }

    boolean findInfinity(int a,int b)
    {
        for(int i=a>b?a:b;i<Math.abs(a-b);i++)
        {
            if(a==b)
                return false;
            a++;
            b--;
        }
        return true;
    }


}


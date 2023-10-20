package GFG.Day1;

public class SeriesAP
{

    public static void Series(int start,int end,int index)
    {
        --index;
        while(index!=0)
        {
            start++;
            index--;
        }

        System.out.println(start);

    }
    public static void main(String[] args)
    {

        Series(1,10,5);

    }
}

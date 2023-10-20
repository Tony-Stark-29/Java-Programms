package Arrays;

public class UniqueNumber
{
    public int uniqueInArray(int[] arr)
    {
        int num=0;
        for (int a:arr)
        {
            num^=a;
            System.out.println(num);
        }

        return num;
    }
}

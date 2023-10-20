import java.util.Arrays;

public class array
{
    public static void main(String arg[])
    {

        int[] arr=new int[8];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}

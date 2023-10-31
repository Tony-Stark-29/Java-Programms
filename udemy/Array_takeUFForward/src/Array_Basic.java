import java.util.Arrays;

public class Array_Basic
{

    public static int getLargest(int[] arr)
    {
        int lar=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>lar)
            {
                lar=arr[i];
            }
        }
        return lar;
    }

    public static int getSecondLargest(int[] arr)
    {
        int first=arr[0],second=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
        }
        return second;
    }

    public static int getUniqueElement(int[] arr)
    {
        int unique=arr[0],index=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=unique)
            {
                arr[++index]=arr[i];
                unique=arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));

        return index+1;
    }

    public static void main(String[] args) {
        System.out.println(getLargest(new int[] {2,4,1,53,15,6,2,78,21}));
        System.out.println(getSecondLargest(new int[] {2,4,1,53,15,6,2,78,21}));

        System.out.println(getUniqueElement(new int[] {1,1,2,2,3,3}));
    }

}

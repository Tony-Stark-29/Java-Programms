import java.util.Arrays;

public class remove_duplicate_elm_array
{
    public static void main(String args[])
    {
        int[] arr={1,1,2,2,2,3,4,4};
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            j=i+1;
            if(i<arr.length-1)
            {
                if(arr[i]==arr[i+1])
                {
                    while(j!=arr.length)
                    {
                        arr[j]=arr[j++];
                    }
                }
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class RemoveElement
{

    public static int majorityElement(int[] arr)
    {
        int elm=arr[0];
        int count=1;

        for(int i=0;i<arr.length;i++)
        {
            if(count==0)
            {
                elm=arr[i];
                count=1;
            }
            else if(elm==arr[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        return elm;
    }


    public static void main(String[] args)
    {

        System.out.println(majorityElement(new int[] {6,5,5}));
        System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));
    }
}

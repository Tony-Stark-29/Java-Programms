import java.util.Arrays;

public class arrayOfObjects
{
    public static void main(String args[])
    {
         int[] arr={1,2,3,4,5};
         arrayOfObjects a=new arrayOfObjects();
         a.change(arr,2,90);
         a.printit(arr);
    }

    public void change(int[] arr,int index,int value)
    {
        arr[index]=value;
    }

    public void printit(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
}

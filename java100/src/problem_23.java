import java.lang.reflect.Array;
import java.util.Arrays;

public class problem_23
{

    public static int[] moveZerosToEnd(int[] arr)
    {
        int nonZeroIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap the non-zero element with the element at nonZeroIndex {-4, 1, 0, 0, 2, 21, 4}
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }

        }

        return arr;
    }

    public static int[] moveZerosToFirst(int[] arr)
    {
        int nonZeroIndex=arr.length-1;

        for(int i= arr.length-1;i>=0;i--)
        {

            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[nonZeroIndex];
                arr[nonZeroIndex]=temp;
                nonZeroIndex--;
            }

        }
    return arr;
    }

    public static void main(String[] args)
    {

//        System.out.println(Arrays.toString(moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3})));
//        System.out.println(Arrays.toString( moveZerosToEnd(new int[] {0, 1, 0, 1, -5, 0, 4})));
//        System.out.println(Arrays.toString(moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1})));
        System.out.println(Arrays.toString( moveZerosToEnd(new int[] {-4, 1, 0, 0, 2, 21, 4})));
        System.out.println(Arrays.toString( moveZerosToFirst(new int[] {-4, 1, 0, 0, 2, 21, 4})));

        char[] arr={'a','b','c','d'};


    }

}

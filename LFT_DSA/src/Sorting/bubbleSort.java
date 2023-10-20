package Sorting;

import java.util.Arrays;

public class bubbleSort
{

    public static int[] BubbleSort(int[] arr)
    {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr={43,5,3,12,8,34,9,242,45};
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }
}

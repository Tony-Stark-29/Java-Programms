package Sorting;

import java.util.Arrays;

public class SelectionSort
{

    public static int[] selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int small=arr[i];
            int smallIndex=i;

            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<small)
                {
                    smallIndex=j;
                    small=arr[j];
                }
            }

            int temp=arr[i];
            arr[i]=small;
            arr[smallIndex]=temp;
        }

        return arr;
    }

    
    public static void main(String[] args) 
    {
        
            int[] arr={43,5,3,12,8,34,9,242,45};
        System.out.println(Arrays.toString(selectionSort(arr)));
   
    }
    
}

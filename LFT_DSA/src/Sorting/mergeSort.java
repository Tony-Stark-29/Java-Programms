package Sorting;

import java.util.Arrays;

public class mergeSort
{


    public static int[] MSort(int[] arr)
    {

        if(arr.length==1)
            return arr;
        int mid=arr.length/2;
        int[] left=MSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=MSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    public static int[] merge(int[] left,int[] right)
    {

        System.out.println("left - "+Arrays.toString(left));
        System.out.println("right - "+Arrays.toString(right));
        int[] merged=new int[left.length+right.length];
        int i=0,j=0,k=0;

        while(i<left.length && j<right.length )
        {

            System.out.println("Comparing : "+left[i]+" "+right[j]);
            if(left[i]<right[j])
            {
                merged[k++]=left[i++];
            }
            else
            {
                merged[k++]=right[j++];
            }
        }

        while(i<left.length)
        {
            merged[k++]=left[i++];
        }

        while(j<right.length)
        {
            merged[k++]=right[j++];

        }

        System.out.println("Merged - "+Arrays.toString(merged));
        return merged;
    }

    public static void main(String[] args) {
        int[] arr={43,5,3,12,8,34,9,242,45};
        System.out.println(Arrays.toString(MSort(arr)));
    }
}

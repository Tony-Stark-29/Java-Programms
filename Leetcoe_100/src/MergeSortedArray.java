import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MergeSortedArray
{
    public static int[] merge(int[] nums1, int m, int[] nums2, int n)
    {
        int index=0;
        for(int i=m;i<nums1.length;i++)
        {
            nums1[i]=nums2[index++];
        }

         Arrays.sort(nums1);

        return nums1;
    }


        public static int[] merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] merged=new int[m+n];
        int i=0,j=0,k=0;

        while(i<m && j<n)
        {
            if(nums1[i]>nums2[j])
            {
                merged[k]=nums2[j++];
            }else
            {
                merged[k]=nums1[i++];
            }
            k++;
        }

            while(i<m)
            {
                merged[k++]=nums1[i++];
            }

            while(j<n)
            {
                merged[k++]=nums2[j++];
            }
            System.out.println(Arrays.toString(merged));
        return  merged;
    }


    public static void main(String[] args)
    {

        int[] arr1={1,2,3,0,0,0};
        int m=3;
        int[] arr2={2,5,6};
        int n=3;

        System.out.println(Arrays.toString(merge2(arr1,m,arr2,n)));

    }
}

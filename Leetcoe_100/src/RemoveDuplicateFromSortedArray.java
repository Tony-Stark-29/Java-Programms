import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {


    public static int removeDuplicate(int[] arr)
    {

        int index=0;
        int elm=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=elm)
            {
                elm=arr[i];
                index++;
            }
        }


        return index+1;
    }

    public static int removeDuplicate2(int[] nums)
    {
        if (nums.length <= 2) {
            return nums.length;
        }

        int index = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
            System.out.println(Arrays.toString(nums));
        }

        return index;

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate(new int[] {0,0,1,1,1,2,2,3,3,4}));
        System.out.println(removeDuplicate2(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }
}

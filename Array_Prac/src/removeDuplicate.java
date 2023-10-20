import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class removeDuplicate
{

        public static int[] removeDuplicates(int[] nums)
        {

            ArrayList <Integer> unique=new ArrayList<>();

            for(int i=0;i<nums.length;i++)
            {
                if(!unique.contains(nums[i]))
                {
                    unique.add(nums[i]);
                }
            }

            int[] arr=new int[unique.size()];
            int index=0;
            for (int n:unique)
            {
                arr[index++]=n;
            }
            return arr;
        }



    public static void main(String[] args)
    {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(Arrays.toString(removeDuplicates(nums)));


    }
}

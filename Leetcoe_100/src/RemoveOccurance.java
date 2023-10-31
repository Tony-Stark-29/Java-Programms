import javax.management.remote.JMXServerErrorException;
import java.util.Arrays;

public class RemoveOccurance
{

    public static int removeOccurance(int[] nums,int val)
    {
        int newLength = 0 ;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[newLength] = nums[i];
                newLength++;
            }

            System.out.println(Arrays.toString(nums));
        }

        return newLength;


    }

    public static void main(String[] args) {
        System.out.println( removeOccurance(new int[] {0,1,2,2,3,0,4,2},2));
    }

}

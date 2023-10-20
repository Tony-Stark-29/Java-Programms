import java.util.Arrays;
public class find_element
{
    public static void main(String args[])
    {
        int[] num={45,7,2,8,9,23,54,23};
        int elm=23;
        for(int i:num)
        {
            if(i==elm)
            {
                System.out.println("Element Found at index "+Arrays.binarySearch(num,elm));
                break;
            }
        }

    }
}

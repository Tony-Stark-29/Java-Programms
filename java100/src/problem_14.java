import java.util.Arrays;

public class problem_14
{


    public  static int[] sumEqualArr(int num1,int num2,int sum)
    {
        if(num1+num2 == sum)
        {
            return new int[] {num1,num2};
        }
        return new int[] {};
    }

    public static void sumEqual(int[] arr,int sum)
    {

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j && sumEqualArr(arr[i],arr[j],sum).length !=0)
                {
                    System.out.println(Arrays.toString(sumEqualArr(arr[i],arr[j],sum)));
                }
            }
        }

    }

    public static void main(String[] args)
    {

        sumEqual(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

    }
}

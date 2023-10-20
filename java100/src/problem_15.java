public class problem_15
{

    private static void findSubArray(int[] arr, int num)
    {

        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];

            for(int j=i+1;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum==num)
                {
                    for(int k=i;k<=j;k++)
                    {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
                else if(sum<num)
                {
                    continue;
                }
                else if(sum>num)
                {
                    sum=0;
                    break;
                }

            }



        }

    }

    public static void main(String[] args) {
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);

        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
    }


}

public class Average_of_element
{
    public static void main(String args[])
    {
        int[] num={45,7,2,8,9,23,54,23};
        int sum=0;
        for(int i:num)
        {
            sum+=i;
        }
        System.out.println(sum/num.length);
    }
}

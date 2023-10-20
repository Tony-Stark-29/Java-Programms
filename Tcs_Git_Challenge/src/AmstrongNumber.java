public class AmstrongNumber
{

    public static boolean isAmstrong(int num)
    {

        int sum=0;
        String numCopy=Integer.toString(num);

        for(int i=0;i<numCopy.length();i++)
        {
            sum+=Math.pow(Integer.parseInt(String.valueOf(numCopy.charAt(i))),numCopy.length());
        }
        return sum==num?true:false;
    }


    public static int pow(int base,int exponent)
    {
        int result=1;
        for(int i=1;i<=exponent;i++)
        {
            result*=base;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(isAmstrong(153));
        System.out.println(pow(3,3));
    }
}